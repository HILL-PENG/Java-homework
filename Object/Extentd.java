package Object;

public class Extentd {
    public static void main(String[] args) {
        Student s = new Student("xiaoMing", 100, 399);
        System.out.println(s.getName() + s.getAge());
        System.out.println(s.getMaxAge());
        System.out.println(s.getSelfMaxAge());

        People p = new Student("x", 1, 2);
        People p1 = new People("a", 2);
        System.out.println(s instanceof People);
        System.out.println(p instanceof Student);
        System.out.println(p1 instanceof Student);
    }
}

class People {
    private String name;
    private int age;
    protected int maxAge = 200;

    protected Append append;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Student extends People {
    private final int maxAge;

    public Student(String name, int age, int maxAge) {
        super(name, age);
        this.maxAge = maxAge;
    }

    public int getMaxAge() {
        return super.maxAge;
    }

    public int getSelfMaxAge() {
        return maxAge;
    }
}

class Append {
}