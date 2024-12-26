import java.util.Arrays;

public class RotateArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rightRotate(arr, 3);

        System.out.println("--------------------------");
        int[] arr2 = {1,2,3,4,5,6};
        leftRotate(arr2, 2);

    }

    public static void rightRotate(int[] arr, int d) {
        int n = arr.length;

        for(int i = 0; i < d; i++) {
            int last = arr[n - 1];

            for(int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
//            Shows the array after each step
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;

        for(int i = 0; i < d; i++) {
            int first = arr[0];

            for(int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
//            Shows the array after each step
            System.out.println(Arrays.toString(arr));
        }
    }
}
