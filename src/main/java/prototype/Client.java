package prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * ClassName: Client <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/13 0013
 * @since JDK 11
 */
public class Client {
    // 用于存放各种原型对象，每种原型对象都对应着一个key,在这里我们用一个字符串来表示每个原型对象的唯一key
    Map<String,Product> protos = new ConcurrentHashMap<>();
    // 该方法用于将原型对象的信息存储在哈希表中
    public void register(String name,Product product){
        protos.put(name,product);
    }
    // 该方法用于创建新的对象，即通过每个原型对象的key获取原型对象的拷贝份。
    public Product create(String protoName){
        Product product = protos.get(protoName);
        return product.createClone();
    }
}
