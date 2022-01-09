package Object;

public class Method1 {
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.speak();

        calculatePlus();
    }

    public void speak() {
        System.out.println("i am a good man");
    }

    public static void calculatePlus() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
