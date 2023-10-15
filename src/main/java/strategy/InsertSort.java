package strategy;

/**
 * ClassName: InsertSort <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class InsertSort implements ISort{
    @Override
    public void sort(int[] arr) {
        System.out.println("This is insert sort:");
        int low = 0;
        int high = 0;
        int m = 0;

        for (int i = 1; i < arr.length; i++) {
            low = 0;
            high = i -1;
            while (low <= high){
                m = (low + high) / 2;
                if(arr[m] > arr[i]){
                    high = m - 1;
                }else {
                    low = m + 1;
                }
            }
            int temp = arr[i];
            for (int j = i; j > high + 1; j--) {
                arr[j] = arr[j-1];
            }
            arr[high + 1] = temp;
        }
    }
}
