package iterator;

import org.junit.Test;

/**
 * ClassName: IteratorTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */

public class IteratorTest {
    @Test
    public void IteratorTest(){
        // 创建一个可以存放10本书的书架
        BookShelf bookShelf = new BookShelf(10);
        // 往里面添加三本书
        bookShelf.appendBook(new Book("One Hundred Years of Solitude"));
        bookShelf.appendBook(new Book("Journey Under the Midnight Sun"));
        bookShelf.appendBook(new Book("3 Body Problem"));
        // 依次遍历书架上放着的书
        for(Iterator it = bookShelf.iterator(); it.hasNext();){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
