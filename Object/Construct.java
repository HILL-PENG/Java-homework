package Object;

public class Construct {
    public static void main(String[] args) {
        Person1 p1 = new Person1("xiaoHei", 20);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getClass());
    }
}

class Person1 {
    private String name = "xx";
    private int age = 22;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
