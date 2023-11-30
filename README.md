&emsp;本科在读大三，目前正在学习设计模式，仓库正在随课程进度更新。文章会最先在我的个人博客进行更新，我的个人博客：[https://pgthinker.me](https://pgthinker.me)。

&emsp;23种设计模式完整系列[点击这里](https://pgthinker.me/category/%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f/)阅读.

![](./books/design%20patterns.png)

## 已完成

&emsp;学习过程中参考《图解设计模式》、菜鸟教程、《设计模式之禅》等，相关书籍：[点击这里](https://github.com/NingNing0111/java-design-patterns/tree/master/books)

&emsp;设计模式分为三种：`创建型模式`、`结构型模式`和`行为型模式`,无论那种，其实现都会遵循下面的七大基本原则：

- **单一职责原则**（Single Responsibility Principle，SRP）： 一个类应该只有一个引起它变化的原因。换句话说，一个类应该只有一个职责。这样可以提高类的内聚性，降低类的耦合度。

- **开放封闭原则**（Open-Closed Principle，OCP）： 软件实体（类、模块、函数等）应该对扩展开放，对修改关闭。即在不修改现有代码的情况下，通过扩展来实现新功能。

- **里氏替换原则**（Liskov Substitution Principle，LSP）： 子类对象应该能够替换父类对象，而不会影响程序的正确性。这意味着子类必须遵守父类的约束和行为规范。

- **接口隔离原则**（Interface Segregation Principle，ISP）： 客户端不应该依赖于它不需要的接口。一个类不应该强迫它的客户端实现它们不需要的方法。

- **依赖倒置原则**（Dependency Inversion Principle，DIP）： 高层模块不应该依赖于低层模块，而是应该依赖于抽象。抽象不应该依赖于具体实现细节，而是应该依赖于抽象接口。

- **迪米特法则**（Law of Demeter，LoD）： 一个对象应该对其他对象有尽可能少的了解。一个对象应该只与它直接的朋友进行交互，而不与朋友的朋友进行交互。

- **合成复用原则**（Composite/Aggregate Reuse Principle，CARP）：尽量使用对象组合（has-a）/聚合（contanis-a）而不是继承关系达到软件复用的目的。

&emsp;具体可看我的博客文章：[SOLID-面向对象设计的基本原则](https://pgthinker.me/2023/11/30/oo/)


### 创建型模式

- [工厂方法(Factory Method)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%b7%a5%e5%8e%82%e6%96%b9%e6%b3%95factory-method%e6%a8%a1%e5%bc%8f/)
- [抽象工厂(Abstract Factory)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%8a%bd%e8%b1%a1%e5%b7%a5%e5%8e%82abstract-factory%e6%a8%a1%e5%bc%8f/)
- [单例(Singleton)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%8d%95%e4%be%8bsingleton%e6%a8%a1%e5%bc%8f/)
- [建造者(Builder)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%bb%ba%e9%80%a0%e8%80%85%e6%a8%a1%e5%bc%8f/)
- [原型(Prototype)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%8e%9f%e5%9e%8bprototype%e6%a8%a1%e5%bc%8f/)

### 结构型模式

- [桥梁(Bridge)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%a1%a5%e6%8e%a5bridge%e6%a8%a1%e5%bc%8f/)
- [适配器(Adapter)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e9%80%82%e9%85%8d%e5%99%a8adapter%e6%a8%a1%e5%bc%8f/)
- [合成(Composite)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e7%bb%84%e5%90%88composite%e6%a8%a1%e5%bc%8f/)
- [装饰器(Decorator)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%a3%85%e9%a5%b0%e5%99%a8decorator%e6%a8%a1%e5%bc%8f/)
- [外观(Facade)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%a4%96%e8%a7%82%ef%bc%88facade%ef%bc%89%e6%a8%a1%e5%bc%8f/)
- [观察者(Observer)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%a7%82%e5%af%9f%e8%80%85observer%e6%a8%a1%e5%bc%8f/)
- [备忘录(Memento)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%a4%87%e5%bf%98%e5%bd%95memento%e6%a8%a1%e5%bc%8f/)
- [状态(State)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e7%8a%b6%e6%80%81state%e6%a8%a1%e5%bc%8f/)
- [代理(Proxy)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e4%bb%a3%e7%90%86proxy%e6%a8%a1%e5%bc%8f/)

### 行为型模式

- [模板方法(Template Method)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%a8%a1%e6%9d%bf%e6%96%b9%e6%b3%95template-method%e6%a8%a1%e5%bc%8f/)
- [迭代器(Iterator)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%bf%ad%e4%bb%a3%e5%99%a8iterator%e6%a8%a1%e5%bc%8f/)
- [策略(Strategy)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e7%ad%96%e7%95%a5strategy%e6%a8%a1%e5%bc%8f/)
- [中介者(Mediator)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e4%b8%ad%e4%bb%8b%e8%80%85mediator%e6%a8%a1%e5%bc%8f/)
- [责任链(Chain Of Responsibility)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%b4%a3%e4%bb%bb%e9%93%bechain-of-responsibility%e6%a8%a1%e5%bc%8f/)
- [访问者(Visitor)模式](https://pgthinker.me/2023/10/17/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%ae%bf%e9%97%ae%e8%80%85visitor%e6%a8%a1%e5%bc%8f/)
- [享元(Flyweight)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e4%ba%ab%e5%85%83flyweight%e6%a8%a1%e5%bc%8f/)
- [命令(Command)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%91%bd%e4%bb%a4command%e6%a8%a1%e5%bc%8f/)
- [解释器(Interpreter)模式](https://pgthinker.me/2023/10/22/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%a7%a3%e9%87%8a%e5%99%a8interpreter%e6%a8%a1%e5%bc%8f/)