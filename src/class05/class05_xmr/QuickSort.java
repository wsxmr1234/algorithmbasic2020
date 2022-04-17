package class05.class05_xmr;

import java.time.temporal.Temporal;
import java.util.Arrays;

public class QuickSort {

    public static int[] partition(int[] arr, int l, int r) {
        if (l > r) {
            return new int[]{-1, -1};
        }

        if (l == r) {
            return new int[]{l, r};
        }

        int num = arr[(int) (l + Math.random() * (r - l + 1))];

        int less = l - 1;
        int more = r + 1;
        int i = l;


        while (i < more) {
            if (arr[i]==num) {
                i++;
            } else if (arr[i] < num) {
                swap(arr, ++less, i++);
            } else {
                swap(arr, i, --more);
            }
        }
        return new int[]{less + 1, more - 1};
    }

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return;
        }
        process(arr, 0, arr.length -1);
    }

    private static void process(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int[] partition = partition(arr, l, r);
        process(arr, 0, partition[0] - 1);
        process(arr, partition[1] + 1, r);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 0, 1, 3, 7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
