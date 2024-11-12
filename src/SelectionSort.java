import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,7,2,8,6};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        int min, aux;

        for(int i = 0; i  < nums.length; i++) {
            min = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min])
                    min = j;
            }
            if(i != min) {
                aux = nums[i];
                nums[i] = nums[min];
                nums[min] = aux;
            }
        }
    }
}
