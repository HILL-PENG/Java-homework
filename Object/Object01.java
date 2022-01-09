package Object;

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.age = 11;
        cat1.color = "white";
        System.out.println("name:" + cat1.name + " age:" + cat1.age + " color:" + cat1.color);
    }
}

class Cat {
    String name;
    int age;
    String color;
}
