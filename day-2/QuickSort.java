package demo2;

public class QuickSort {

    public static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quick(arr, low, pi - 1);
            quick(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high && arr[i] <= pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};

        quick(arr, 0, arr.length - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}