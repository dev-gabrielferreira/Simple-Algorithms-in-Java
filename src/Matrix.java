import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1,2},{1,0}};
        int[][] b = {{1,1},{0,1}};
        int[][] c = {
                {1,4,2},
                {3,2,0},
                {1,1,1}
        };

        System.out.println("Sum -------");
        sum(a, b);
        System.out.println("Product --------");
        product(a, b);
        System.out.println("Transposed -------");
        transpose(c);
        System.out.println("Trace ---------");
        trace(c);
        System.out.println("Norm ---------");
        norm(c);
    }

    public static void sum(int[][] a, int[][] b) {
        if(a.length != b.length || a[0].length != b[0].length) {
            throw new Error("Matrices don't have the same dimensions");
        }

        int column = a.length;
        int row = a[0].length;

        int[][] result = new int[column][row];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int[] r: result) {
            System.out.println(Arrays.toString(r));
        }
    }

    public static void product(int[][] a, int[][] b) {
        if(a[0].length != b.length) {
            throw new Error("The number of columns in matrix A must be equal to the number of rows in matrix B");
        }

        int[][] result = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] + b[k][j];
                }
            }
        }

        for(int[] r: result) {
            System.out.println(Arrays.toString(r));
        }
    }

    public static void transpose(int[][] a) {
        int[][] result = new int[a[0].length][a.length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                result[j][i] = a[i][j];
            }
        }

        for(int[] r: result) {
            System.out.println(Arrays.toString(r));
        }
    }

    public static void trace(int[][] a) {
        if(a.length != a[0].length) {
            throw new Error("Matrix A must be a square matrix");
        }

        int result = 0;

        for(int i = 0; i < a.length; i++) {
            result += a[i][i];
        }

        System.out.println("Trace A: " + result);
    }

    public static void norm(int[][] a) {
        double accumulated = 0;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                accumulated += Math.pow(a[i][j], 2);
            }
        }

        double sqrt = Math.sqrt(accumulated);
        System.out.println("Norm: " + String.format("%.2f", sqrt));
    }
}
