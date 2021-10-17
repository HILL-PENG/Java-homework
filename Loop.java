import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
//        Loop.calculateTimes();
//        Loop.compareWithZero();
        Loop.isNarcissistic();
    }

    // 1.
    private static void calculateTimes()
    {
        int money = 100000;
        int count = 0;
        while (money > 1000) {
            if (money > 50000)   {
                money -= money * 0.05;
            } else {
                money -= 1000;
            }
            count++;
        }
        System.out.println(count);
    }

    // 2.
    private static void compareWithZero()
    {
        System.out.println("Please input a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String res = "";
        if (num > 0) {
            res = "The num you input is bigger than 0";
        } else if (num < 0) {
            res = "The num you input is smaller than 0";
        } else {
            res = "The num you input is equal to 0";
        }
        System.out.println(res);
    }

    // 3.
    private static void isNarcissistic()
    {
        System.out.println("Please input a num");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int length = Loop.getNumLength(num);
        String strOfNum = String.valueOf(num);
        int[] arrOfNum = new int[strOfNum.length()];
        for (int i = 0; i < strOfNum.length(); i++) {
            Character ch = strOfNum.charAt(i);
            arrOfNum[i] = Integer.parseInt(ch.toString());
        }
        int temp = 0;
        for (int i = 0; i < length; i++) {
            temp += (arrOfNum[i] * arrOfNum[i] * arrOfNum[i]);
        }
        String res = new String();
        if (num == temp) {
            res = num + " is narcissistic";
        } else {
            res = num + " is not narcissistic";
        }
        System.out.println(res);
    }

    private static int getNumLength(long num)
    {
        if (num == 0) {
            return 1;
        }
        num = num > 0 ? num : -num;
        return String.valueOf(num).length();
//        int length = 0;
//        for (long temp = num; temp != 0; temp /= 10) {
//            length++;
//        }
//        return length;
    }
}