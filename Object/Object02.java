package Object;

public class Object02 {
    public static void main(String[] args) {
        Person xiaoMing = new Person();
        xiaoMing.setName("xiaoMing");
        xiaoMing.setAge(229);
        System.out.println(xiaoMing.getName());
        System.out.println(xiaoMing.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 200 || age < 0) {
            throw new IllegalArgumentException("invalid age");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}