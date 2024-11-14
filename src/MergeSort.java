import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 7, 2, 8, 6};
        mergeSort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++)
            left[i] = nums[i];

        for (int i = mid; i < n; i++)
            right[i - mid] = nums[i];

        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(nums, left, right, mid, n - mid);
    }

    public static void merge(int[] nums, int[] left, int[] right, int l, int r) {
        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        while (i < l) {
            nums[k++] = left[i++];
        }
        while (j < r) {
            nums[k++] = right[j++];
        }
    }
}


