public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(nums, 10));
    }

    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                return i;
        }

        return -1;
    }
}
