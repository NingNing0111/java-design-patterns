package strategy;

/**
 * ClassName: BubbleSort <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class BubbleSort implements ISort{
    @Override
    public void sort(int[] arr) {
        System.out.println("This is bubble sort:");
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            flag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
