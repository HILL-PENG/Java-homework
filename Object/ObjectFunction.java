package Object;

public class ObjectFunction {
    public static void main(String[] args) {
        Person01 p1 = new Person01("mike", 20);
        Person01 p2 = new Person01("mike", 20);
        System.out.println(p1.toString());
    }
}

class Person01 {
    String name;
    int age;

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "haha";
        return super.toString();
    }

    @Override
    public boolean equals(Object p) {
        return !(p instanceof Person01);
    }
}