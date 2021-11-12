package Array;

import java.util.Objects;
import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
//        normal();
        loop();
    }

    private static void normal() {
        int[] arr = {1, 2, 3};
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = 4;
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void loop() {
        System.out.println("please enter new int:");

        Scanner input = new Scanner(System.in);
        int[] arr = new int[0];
        do {
            if (input.hasNextInt()) {
                int tempInt = input.nextInt();
                int[] tempArr = new int[arr.length + 1];
                for (int i = 0; i < tempArr.length; i++) {
                    if (i == tempArr.length - 1) {
                        tempArr[i] = tempInt;
                    } else {
                        tempArr[i] = arr[i];
                    }
                }
                arr = tempArr;
                for (int j : arr) {
                    System.out.println(j);
                }
            } else {
                String isQuit = input.next();
                if (Objects.equals(isQuit, "quit")) {
                    break;
                }
            }
            System.out.println("please enter a int: (type quit if you want to quit)");
        } while(true);
    }
}
