package Object;

public abstract class Abstract {
    /**
     * 抽象方法实际上相当于定义了“规范”
     */
    public abstract void download();

    public static void main(String[] args) {
        Thunder t = new Thunder();
        t.download();
    }
}

class Thunder extends Abstract {
    @Override
    public void download() {
        System.out.println("Thunder download");
    }
}
