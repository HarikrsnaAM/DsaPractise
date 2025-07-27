public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        //pushes max element to the right by adjacent element comparing and swaping.
        int length = arr.length;
        for (int i=length-1;i>=1;i--){
            for (int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (Integer n : arr){
            System.out.println(n);
        }

    }
}
