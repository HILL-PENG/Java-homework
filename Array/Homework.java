package Array;

public class Homework {
    public static void main(String[] args) {
//        homework02();
//        homework03();
        homework04();
    }

    public static void homework02() {
        String foo = "blue";
        boolean[] bar = new boolean[2];
        if (bar[0]) {
            foo = "green";
        }
        System.out.println(foo);
    }

    public static void homework03() {
        int num = 1;
        while (num < 10) {
            System.out.println(num);
            if (num > 5) {
                break;
            }
            num += 2;
        }
    }

    public static void homework04() {
        int[] arr = {10, 12, 45, 90};
        int newInt = 23;
        int newIntInsertIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (newInt <= arr[i]) {
                newIntInsertIndex  = i;
                break;
            }
        }
        if (newIntInsertIndex == -1) {
            System.out.println("没有合适位置");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == newIntInsertIndex) {
                newArr[i] = newInt;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        for (int x : newArr) {
            System.out.println(x);
        }
    }
}
