package strategy;

/**
 * ClassName: Sort <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class Sort implements ISort{

    private ISort iSort;

    public Sort(ISort iSort){
        this.iSort = iSort;
    }

    @Override
    public void sort(int[] arr) {
        iSort.sort(arr);
    }

    public void setSort(ISort iSort){
        this.iSort = iSort;
    }
}
