package iterator;

/**
 * ClassName: BookShelf <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        books = new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
