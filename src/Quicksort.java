import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] nums = {3,2,5,17,6,11,8,1,4,12,9};
        quicksort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quicksort(int [] nums, int low, int high) {
        if(low < high){
            int pivot = partition(nums, low, high);
            quicksort(nums, low, pivot - 1);
            quicksort(nums, pivot + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int s = low, e = high - 1;

        while(s <= e) {
            while(s <= e && nums[s] <= pivot)
                s++;
            while(s <= e && nums[e] > pivot)
                e--;
            if(s < e)
                swap(nums, s, e);

        }
        swap(nums, s, high);
        return s;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
