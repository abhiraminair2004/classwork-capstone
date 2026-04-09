package demo2;

public class Bubble {

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 11, 90};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}