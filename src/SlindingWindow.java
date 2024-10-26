public class SlindingWindow {
    public static void main(String[] args) {
        int[] nums = {1,4,-2,5,3,-6};
        int result = maxSumSubarray(nums, 3);
        System.out.println(result);
    }

    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0, currentSum = 0;

        for(int i = 0; i < k; i++)
            currentSum += nums[i];

        maxSum = Math.max(maxSum, currentSum);

        for(int i = k; i < nums.length; i++) {
            currentSum += (nums[i] - nums[i - k]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
