package strategy;

import org.junit.Test;

/**
 * ClassName: StrategyTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class StrategyTest {
    @Test
    public void strategyTest(){
        int[] arr = {5,4,3,6,7,4,2,1,0,8,9,10};
        Sort sort = new Sort(new QuickSort());
        sort.sort(arr);
        display(arr);
        arr = new int[]{4, 5, 2, 3, 4, 5, 6, 7, 1, 2, 0, 10};
        sort.setSort(new InsertSort());
        sort.sort(arr);
        display(arr);

        arr = new int[]{7,6,5,8,9,32,4,2,3,0};
        sort.setSort(new BubbleSort());
        sort.sort(arr);
        display(arr);
    }

    public void display(int arr[]){
        for (int e :
                arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println();
    }
}
