import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int length = arr.length;
        for (int i=0; i<=length-2;i++){
            int minIndex = i;
            for (int j=i;j<=length-1;j++){
                if (arr[j]<arr[i]){
                    minIndex =j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int a : arr){
            System.out.println(a);
        }
    }
}
