package class01_xmr;

public class BinarySearch {
    // 是否存在
    public static boolean exist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        int mid = 0;
        while (l < r) {
            mid = l + ((r - l) >> 1);
            if (arr[mid] > num) {
                r = mid - 1;
            } else if (arr[mid] == num) {
                return true;
            } else {
                l = mid + 1;
            }
        }
        return arr[l] == num;
    }

    //查找给定数的索引，-1表示不存在
    public static int findIndex(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int mid = 0;

        while (l <= r) {
            mid = l + ((r - l) >> 1);
            if (arr[mid] > num) {
                r = mid - 1;
            } else if (arr[mid] == num) {
                return mid;
            } else {
                l = mid + 1;
            }
        }

        return -1;

    }

    public static int leftestIndex(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        int index = -1;
        int mid = -1;
        while (l <= r) {
            mid = l + ((r - r) >> 1);
            if (arr[mid] >= value) {
                index = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }
}
