import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(twoSum(nums, 14)));
        System.out.println(Arrays.toString(twoSum(nums, 20)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];

        while(start < end) {
            int currentSum = nums[start] + nums[end];
            if(currentSum == target) {
                result[0] = start;
                result[1] = end;
                return result;
            }

            if(currentSum > target)
                end--;

            if(currentSum < target)
                start++;

        }

        result[0] = -1;
        result[1] = -1;
        return result;
    }
}
