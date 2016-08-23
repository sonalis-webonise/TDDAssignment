import java.util.Arrays;

public class QuickSort {


    public void quickSort(int[] arr, int low, int high){

            int middle = low + (high - low) / 2;
            int pivot = arr[middle];

            int i = low, j = high;
            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }

                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j)
                quickSort(arr, low, j);

            if (high > i)
                quickSort(arr, i, high);

        }
}