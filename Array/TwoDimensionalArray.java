package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        1.固定行列
//        int arr[][] = new int[2][2];

//        2.动态行列
        int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
