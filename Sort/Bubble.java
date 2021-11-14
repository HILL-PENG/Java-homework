package Sort;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {8, 1, 3, 6, 9, 2, 4, 7, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
