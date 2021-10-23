import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
//        double average = Array01.getAverage();
//        System.out.println("the average of these num is " + average);

//        Array01.getSum();

        Array01.getAlphabet();
    }

    private static double getAverage() {
        double[] weight = {6, 6, 6, 6, 6.5, 6.1};// 数组的静态初始化
        double sum = 0.0;
        for (int i = 1; i < weight.length; i++) {
            sum += weight[i];
        }
        double average = 0.0;
        average = sum / weight.length;
        return average;
    }

    private static void getSum() {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("please input number " + (i + 1) + " num");
            nums[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (double num : nums) {
            sum += num;
        }
        System.out.println("the sum is " + sum);
    }

    private static void getAlphabet() {
        Character[] alphabet = new Character[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
            System.out.println(alphabet[i]);
        }
    }
}
