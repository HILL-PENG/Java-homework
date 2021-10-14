class Loop {
    public static void main(String[] args) {
        Loop.one();
    }

    // 1.
    public static void one()
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
        System.out.printf("%d", count);
    }
}