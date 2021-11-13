package Array;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("if you want to reduce: (y/n)");
        do {
            if (input.hasNext()) {
                Character isReduce = input.next().charAt(0);
                if (isReduce == 'y') {
                    if (array.length == 1) {
                        System.out.println("you can not reduce any more");
                        break;
                    }
                    int[] tempArray = new int[array.length - 1];
                    for (int i = 0; i < tempArray.length; i++) {
                        tempArray[i] = array[i];
                    }
                    array = tempArray;
                    for (int j : array) {
                        System.out.println(j);
                    }
                } else if (isReduce == 'n') {
                    break;
                }
            }
            System.out.println("if you want to reduce: (y/n)");
        } while (true);
    }
}
