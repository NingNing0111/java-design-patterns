package prototype;

/**
 * ClassName: Product <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/13 0013
 * @since JDK 11
 */
public interface Product extends Cloneable{
    // 其子类都具备use方法，该方法可以将str按照某种样式进行输出，至于具体的输出形式和实现方法由子类决定
    void use(String str);
    // 其子类需要提供一个复制方法，将自身复制一份并返回，复制对象及其过程由子类决定
    Product createClone();
}
