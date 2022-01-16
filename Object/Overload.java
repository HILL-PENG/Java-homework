package Object;

public class Overload {
    public static void main(String[] args) {
        Overload o = new Overload();
        o.hello();
        o.hello("ni hao");
    }

    public void hello() {
        System.out.println("hello");
    }

    public void hello(String name) {
        System.out.println(name);
    }
}