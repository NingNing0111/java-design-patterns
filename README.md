&emsp;本科在读大三，目前正在学习设计模式，仓库正在随课程进度更新。文章会最先在我的个人博客进行更新，我的个人博客：[https://pgthinker.me](https://pgthinker.me)。


## 已完成

&emsp;学习过程中参考《图解设计模式》、菜鸟教程、《设计模式之禅》等，相关书籍：[点击这里](https://github.com/NingNing0111/java-design-patterns/tree/master/books)

&emsp;设计模式分为三种：`创建型模式`、`结构型模式`和`行为型模式`,无论那种，其实现都会遵循下面的六大基本原则：

- **单一职责原则**（Single Responsibility Principle，SRP）： 一个类应该只有一个引起它变化的原因。换句话说，一个类应该只有一个职责。这样可以提高类的内聚性，降低类的耦合度。

- **开放封闭原则**（Open-Closed Principle，OCP）： 软件实体（类、模块、函数等）应该对扩展开放，对修改关闭。即在不修改现有代码的情况下，通过扩展来实现新功能。

- **里氏替换原则**（Liskov Substitution Principle，LSP）： 子类对象应该能够替换父类对象，而不会影响程序的正确性。这意味着子类必须遵守父类的约束和行为规范。

- **依赖倒置原则**（Dependency Inversion Principle，DIP）： 高层模块不应该依赖于低层模块，而是应该依赖于抽象。抽象不应该依赖于具体实现细节，而是应该依赖于抽象接口。

- **接口隔离原则**（Interface Segregation Principle，ISP）： 客户端不应该依赖于它不需要的接口。一个类不应该强迫它的客户端实现它们不需要的方法。

- **迪米特法则**（Law of Demeter，LoD）： 一个对象应该对其他对象有尽可能少的了解。一个对象应该只与它直接的朋友进行交互，而不与朋友的朋友进行交互。


### 创建型模式

- [工厂方法(Factory Method)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%b7%a5%e5%8e%82%e6%96%b9%e6%b3%95factory-method%e6%a8%a1%e5%bc%8f/)
- [抽象工厂(Abstract Factory)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%8a%bd%e8%b1%a1%e5%b7%a5%e5%8e%82abstract-factory%e6%a8%a1%e5%bc%8f/)
- [单例(Singleton)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%8d%95%e4%be%8bsingleton%e6%a8%a1%e5%bc%8f/)
- [建造者(Builder)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%bb%ba%e9%80%a0%e8%80%85%e6%a8%a1%e5%bc%8f/)
- [原型(Prototype)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e5%8e%9f%e5%9e%8bprototype%e6%a8%a1%e5%bc%8f/)

### 结构型模式

- [桥梁(Bridge)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%a1%a5%e6%8e%a5bridge%e6%a8%a1%e5%bc%8f/)
- [适配器(Adapter)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e9%80%82%e9%85%8d%e5%99%a8adapter%e6%a8%a1%e5%bc%8f/)

### 行为型模式

- [模板方法(Template Method)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e6%a8%a1%e6%9d%bf%e6%96%b9%e6%b3%95template-method%e6%a8%a1%e5%bc%8f/)
- [迭代器(Iterator)模式](https://pgthinker.me/2023/10/13/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e8%bf%ad%e4%bb%a3%e5%99%a8iterator%e6%a8%a1%e5%bc%8f/)
- [策略(Strategy)模式](https://pgthinker.me/2023/10/15/23%e7%a7%8d%e5%b8%b8%e7%94%a8%e8%ae%be%e8%ae%a1%e6%a8%a1%e5%bc%8f-%e7%ad%96%e7%95%a5strategy%e6%a8%a1%e5%bc%8f/)