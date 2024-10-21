public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(nums, 8));
    }

    public static int binarySearch(int[] arr, int target) {
        int right = arr.length - 1;
        int left = 0;
        int middle = 0;

        while(left <= right) {
            middle = (left + right) / 2;

            if(arr[middle] == target)
                return middle;
            if(arr[middle] < target)
                left = middle + 1;
            if(arr[middle] > target)
                right = middle - 1;
        }

        return -1;
    }

}
