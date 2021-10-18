import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
//        Loop.calculateTimes();
//        Loop.compareWithZero();
//        Loop.isNarcissistic();
//        Loop.whatWillPrint();
//        Loop.getNumCannotPlus();
//        Loop.getAlphabet();
        Loop.getAddition();
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

    // 4.
    private static void whatWillPrint()
    {
        int m = 0, n = 3;
        if (m > 0) {
            if (n > 2) {
                System.out.println("OK1");
            } else {
                System.out.println("OK2");
            }
        }
    }

    // 5.
    private static void getNumCannotPlus()
    {
        int maxNum = 100;
        int count = 1;
        for (int num = 1; num <= maxNum; num++) {
            if (num % 5 != 0) {
                if (count % 5 == 0) {
                    System.out.println(num);
                } else {
                    if (num > 9) {
                        System.out.print(num + " ");
                    } else {
                        System.out.print(num + "  ");
                    }
                }
                count++;
            }
        }
    }

    // 6.
    private static void getAlphabet()
    {
        int lowerA = (int) 'a';
        int lowerZ = (int) 'z';
        int UpperA = (int) 'A';
        int UpperZ = (int) 'Z';
        System.out.println(lowerA);
        for (int i = lowerA; i <= lowerZ; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println("");
        for (int i = UpperA; i <= UpperZ; i++) {
            System.out.print((char) i + " ");
        }
    }

    // 7.
    public static void getAddition() {
        int maxNum = 100;
        double res
    }
}