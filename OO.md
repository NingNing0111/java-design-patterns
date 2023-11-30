# 面向对象设计的五大原则

&emsp;在20世纪90年代末到21世纪初`罗伯特·C·马丁`将面向对象编程和设计中广为接受和应用的一组准则总结为`SOLID`，其分别表示:

- **单一职责原则（Single Responsibility Principle,SRP）**
- **开闭原则（Open-Closed Principle,OCP）**
- **里氏替换原则（Liskov Substitution Principle,LSP）**
- **接口隔离原则（Interface Segregation Principle,ISP）**
- **依赖倒置原则（Dependency Inversion Principle,DIP）**。

&emsp;`SOLID`是面向对象设计的主要基本原则，这些原则旨在提高软件的可维护性、灵活性和可拓展性。除了上述的`SOLID`原则以外，可能还听说过`迪米特原则`和`合成复用原则`，这些原则都是对`SOLID`的扩展解释和进一步的强调。

## 1. 单一职责原则（S）

> This principle states that each class should have one responsibility, one single purpose.

&emsp;单一职责原则(SRP)规定**一个类应该只有一个功能领域中的相应职责，一个单一的需求目的**。这或者可以定义为：**就一个类而言，应该只有一个引起它变化的原因，不应该存在多于一个导致类变更的原因**。一个类/接口/方法只负责一项职责。

> It should have only one reason to change.

&emsp;在面向对象设计中，我们不希望一个类知道太多或拥有太多与它不相干的行为，因为这些类是很难进行维护的。例如有一个因为一些原因，被我们修改了很多的类，我们不应该继续将这臃肿的类进行维护下去，而是将其负责的多个功能分解为更多的类，让这些类承担不同的职责。当程序出现问题时，我们可以非常方便地对出现问题的功能所负责的类进行修改。

### 代码示例

&emsp;假设我们有下述的接口，既包括对学生信息的查询又包括对课程信息的查询。

```java
public interface IStudent {
    Student getStudent(String sId);
    List<Student> getAllStudents();
    void addStudent(Student student);
    Course getCourse(String sId);
    void addCourse(Course course,Student sId);
}
```

&emsp;很明显，上述接口负责的职责过多，显得整个接口十分臃肿，为了方便维护，我们可以根据职责划分为多个接口。

```java
public interface IStudent {
    Student getStudent(String sId);
    List<Student> getAllStudents();
    void addStudent(Student student); 
}
```

```java
public interface ICourse {
    Course getCourse(String sId);
    void addCourse(Course course,Student sId); 
}
```

&emsp;单一职责原则是**高内聚低耦合的指导方针，可以降低类的复杂度，提高类的可读性，提高系统的可维护性、降低变更引起的风险**。通俗理解，就是不能让一个类负责太多不同领域的职责，不能让它太累。在软件设计过程中，要尝试将职责进行分离，不同职责封装在不同的类中，这样就可以降低我们设计软件的复杂度了。

>  单一职责原则不仅仅适用于面向对象编程语言设计，只要是模块化的编程，都适用。

## 2. 开闭原则（O）

> This principle states that software entities should be open for extension, but closed for modification.

&emsp;开闭原则(OCP)**要求我们软件实体应该对扩展开放，对修改关闭**。结合实际来看，当软件需求发生改变时，我们只能在原有的软件基础上进行扩展而不能对软件内部进行修改。

&emsp;在Java中，接口就是一种遵循OCP原则的一种方式。

### 代码示例

```java
public interface IStudent{
    void addStudent(Student student);
    List<Student> getAllStudent();
    void deleteStudent(Student student);
    void updateStudent(Student student);
} 
```

```java
public class StudentService implements IStudent {
    // 具体的业务代码
}
```

&emsp;现在我们需要添加处理访学、参军、延毕等学生的业务，这种情况下，我们只需要写一个`StudentSpecialService`类去继承`Student`类进行扩展即可。

```java
public class StudentSpecialService extends StudentService {
    // 扩展业务
}
```

&emsp;当我们需要使用`StudentSpecialService`类中定义的功能时，可以通过下述代码进行调用：

```java
IStudent studentService = new StudentService();
StudentSpecialService studentSpecialService = (StudentSpecialService) studentService; 
```

&emsp;用抽象构建框架，用实现扩展细节。优点：提高软件系统的可复用性和可维护性。实现开闭原则的核心思想，就是面向抽象继承。


## 3. 里氏替换原则（L）

> Subtypes must be substitutable for their base types.

&emsp;里氏代换原则(Liskov Substitution Principle, LSP)：**所有引用基类（父类）的地方必须能透明地使用其子类的对象**。简单点就是子类可以替换其父类。

&emsp;LSP的定义是：**如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1代换o2时，程序P的行为没有变化，那么类型S是类型T的子类型。**

> If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T.

&emsp;里氏替换原则告诉我们：**在软件中将一个基类对象替换成它的子类对象，程序将不会产生任何错误和异常，反过来则不成立，如果一个软件实体使用的是一个子类对象的话，那么它不一定能够使用基类对象**。例如：我喜欢吃蔬菜，那么我一定喜欢吃青菜；但是我喜欢吃青菜，不能断定我喜欢吃蔬菜。

&emsp;引申拓展：**子类可以扩展父类的功能，但是不能修改父类的功能**。

### 示例代码

&emsp;假设有一个基类`Shape`,它有一个方法`calculateArea()`。然后，我们有两个子类`Rectangle`和`Square`。根据LSP，`Square`类应该能够替换`Rectangle`类而不影响程序的行为。

&emsp;错误示例：

```java
// 基类
class Shape {
    public double calculateArea() {
        return 0;
    }
}

// 矩形类
class Rectangle extends Shape {
    private double width;
    private double height;

    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 正方形类
class Square extends Rectangle {
    public void setWidth(double w) {
        super.setWidth(w);
        super.setHeight(w);
    }

    public void setHeight(double h) {
        super.setWidth(h);
        super.setHeight(h);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Expected area of square (50.0), got: " + rect.calculateArea());
    }
}
```

&emsp;在上述示例中，`Square`是`Rectangle`的子类。按照里氏替换原则，我们可以用 `Square` 的实例替换 `Rectangle` 的实例。但是，当我们尝试设置 `Square` 的宽和高不一致时，由于 `Square` 类中的 `setWidth` 和 `setHeight` 方法将宽和高设置为相同的值，这会违反矩形的定义，因此这个设计违反了LSP。

&emsp;正确示例：

```java
// 形状基类
abstract class Shape {
    public abstract double calculateArea();
}

// 矩形类
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// 正方形类
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + shape1.calculateArea());

        Shape shape2 = new Square(5);
        System.out.println("Square Area: " + shape2.calculateArea());
    }
}

```

&emsp;在这个修正后的设计中，`Rectangle` 和 `Square` 都继承自 `Shape` 类。它们各自实现了 `calculateArea` 方法。由于 `Rectangle` 和 `Square` 没有直接的继承关系，因此它们的行为不会互相影响，从而符合LSP原则。

&emsp;里氏替换原则约束了继承泛滥，是开闭原则的一种体现；它加强了程序的健壮性，同时在变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性，降低需求变更时引入的风险。

## 4. 接口隔离原则（I）

> This principle was first defined by Robert C. Martin as: “Clients should not be forced to depend upon interfaces that they do not use“.

&emsp;接口隔离原则（ISP）要求我们**使用多个专门的接口，而不使用单一的总接口**，即**客户端不应该依赖那些它不需要的接口**。

- 一个类对一个类的依赖应该建立在最小的接口上；
- 要建立单一接口不要建立庞大臃肿的接口；
- 尽量细化接口，接口中的方法应该尽量少；

&emsp;**在使用接口隔离原则时，我们需要注意控制即可的粒度，接口不能太小，如果太小会导致系统中接口泛滥，不利于维护；接口也不能太大，太大的接口将违背接口隔离原则，灵活性较差，使用起来很不方便**。一般而言，接口中仅包含为某一类用户定制的方法即可，不应该强迫客户端依赖于那些它们不用的方法。这同样符合我们**高内聚，低耦合**的思想。

### 示例代码

&emsp;接口：

```java
public interface Payment { 
    void initiatePayments();
    Object status();
    List<Object> getPayments();
}
```

&emsp;接口实现类：

```java
public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
       // ...
    }

    @Override
    public Object status() {
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // ...
    }
}
```

&emsp;为了方便起见，我先忽略具体的实现代码。从上述代码可以知道，`BankPayment`需要`Payment`接口中的所有方法，因此它并不违法ISP原则。

&emsp;随着业务的发展，我们需要实现一个`LoanPayment`类，它也是一种付款方式，但会有更多的操作。为了开发这一功能，就需要对上面的`Payment`接口添加一些新方法。

```java
public interface Payment {
 
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    // 接口被污染的两个方法
    void intiateLoanSettlement();
    void initiateRePayment();
}
```

&emsp;`LoanPayment`类如下：

```java
public class LoanPayment implements Payment {

    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("This is not a bank payment");
    }

    @Override
    public Object status() {
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // ...
    }

    @Override
    public void intiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }
}
```

&emsp;但是为了实现这个`LoanPayment`类，原来的`BankPayment`类就需要这样实现:

```java
public class BankPayment implements Payment {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // ...
    }

    @Override
    public void intiateLoanSettlement() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException("This is not a loan payment");
    }
}
```

&emsp;为接口添加一些子类不必要的方法，这就导致了`接口污染`，同时违背了ISP原则。为了解决这一问题，我们需要将不同方法分离出来，单独作为接口进行实现。

&emsp;首先可以先确定父类接口,这个接口包含每种支付方式均具备的方法。

```java
public interface Payment {
    Object status();
    List<Object> getPayments();
}
```

&emsp;然后定义不同功能的接口，继承该`Payment`接口。

```java
public interface Bank extends Payment {
    void initiatePayments();
}
```

```java
public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}
```

&emsp;然后依次实现`BankPayment`和`LoanPayment`即可.

```java
public class BankPayment implements Bank {

    @Override
    public void initiatePayments() {
        // ...
    }

    @Override
    public Object status() {
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // ...
    }
}
```

```java
public class LoanPayment implements Loan {

    @Override
    public void intiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }

    @Override
    public Object status() {
        // ...
    }

    @Override
    public List<Object> getPayments() {
        // ...
    }
}
```

&emsp;这样就解决了接口污染，并且不会违背ISP原则。

## 5. 依赖倒置原则（D）

> The general idea of this principle is as simple as it is important: **High-level modules, which provide complex logic, should be easily reusable and unaffected by changes in low-level modules, which provide utility features. To achieve that, you need to introduce an abstraction that decouples the high-level and low-level modules from each other.**

&emsp;依赖倒置原则(DIP)的思想非常简单且十分重要：**提供复杂逻辑的高层模块应该易于复用，并且不受提供具体实现功能的低层模块的更改影响**。为了实现这一点，就需要引入抽象，将高级模块和低级模块进行解耦。基于这点，就引出了两条重要论述：

- 高层模块不应该依赖于低层模块，两者都应该依赖于抽象；
- 抽象不应该依赖于细节，细节应该取决于抽象。

&emsp;它通过向高层模块和低层模块之间引入了一个抽象概念，拆分了它们之间的依赖关系。因此，我们就能得到两个依赖关系：

- 高层模块依赖于抽象
- 低层模块依赖于同一抽象

### 示例代码

&emsp;假设我们需要实现一个消息发送服务。在不遵循DIP的情况下，高层模块（如消息发送服务）可能直接依赖于低层模块（如具体的邮件发送器或短信发送器）。为了遵循DIP，我们可以引入一个抽象的消息发送接口，然后让高层模块依赖于这个接口，而具体的发送器实现这个接口。

```java
// 消息发送接口（抽象）
interface MessageSender {
    void sendMessage(String message);
}

// 邮件发送实现（具体实现）
class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

// 短信发送实现（具体实现）
class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// 消息服务类（高层模块）
class MessageService {
    private MessageSender messageSender;

    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String message) {
        messageSender.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageService emailService = new MessageService(emailSender);
        emailService.send("Hello via Email");

        MessageSender smsSender = new SMSSender();
        MessageService smsService = new MessageService(smsSender);
        smsService.send("Hello via SMS");
    }
}
```

在这个例子中，`MessageService`（高层模块）不直接依赖于邮件发送（`EmailSender`）或短信发送（`SMSSender`）的具体实现（低层模块），而是依赖于一个抽象接口 `MessageSender`。这样，如果未来需要添加新的消息发送方式，我们只需添加一个新的 `MessageSender` 实现类，而无需修改 MessageService 类。这样的设计更加灵活和可维护，符合依赖倒置原则。

## 其他原则

&emsp;OO设计的五大基本原则SOLID已经介绍完毕了,在此基础上，可能还听说过`勒米特法则(LoD)`和`合成复用原则(CRP)`.这两个原则都是对SOLID的扩展论述和强调。

&emsp;LoD：**个对象应该对其他对象保持最少的了解，又叫最少知道原则**。它要求我们在设计系统时，应该尽量减少对象之间的交互，如果两个对象之间不必彼此直接通信，那么这两个对象就不应当发生任何直接的相互作用，如果其中的一个对象需要调用另一个对象的某一个方法的话，可以通过第三者转发这个调用。简言之，就是通过引入一个合理的第三者来降低现有对象之间的耦合度。

&emsp;CRP：**对象组合/聚合，而不是继承来达到复用的目的**。


