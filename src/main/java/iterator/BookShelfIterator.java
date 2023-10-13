package iterator;

/**
 * ClassName: BookShelfIterator <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/10 0010
 * @since JDK 11
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < this.bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = this.bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
