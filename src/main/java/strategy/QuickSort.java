package strategy;

/**
 * ClassName: QuickSort <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/15 0015
 * @since JDK 11
 */
public class QuickSort implements ISort{

    @Override
    public void sort(int[] arr) {
        System.out.println("This is quick sort:");
        quickSort(arr,0,arr.length-1);
    }

    private int partition(int arr[],int start,int end){
        int pivot = arr[start];
        int left = start + 1;
        int right = end;
        while (left < right){
            while (left < right && arr[left] < pivot) left++;
            while (left < right && arr[right] > pivot) right--;
            if (left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        if(left == right && arr[left] > pivot) right--;
        int temp = arr[start];
        arr[start] = arr[right];
        arr[right] = temp;
        return right;
    }

    private void quickSort(int arr[],int satrt,int end){
        if(satrt < end){
            int pivotIndex = partition(arr,satrt,end);
            quickSort(arr,satrt,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }
}
