import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,7,2,8,6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        int size = nums.length;

        for(int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;

            while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
