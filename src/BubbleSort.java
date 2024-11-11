import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,7,2,8,6};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] nums) {
        int size = nums.length;
        for(int j = 0; j < size - 1; j++) {
            for(int i = 0; i < size - 1; i++) {
                if(nums[i] > nums[i + 1]) {
                    int aux = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = aux;
                }
            }
        }
    }
}
