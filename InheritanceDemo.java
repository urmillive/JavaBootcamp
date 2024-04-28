// super() and this() should be the first statement in the constructor
class Base {
    public Base() {
        this(5);
        System.out.println("Base");
    }

    public Base(int n) {
        System.out.println("Base with Parameter");
    }
}

class Child extends Base {
    public Child() {
        super();
        System.out.println("Child");
    }

    public Child(int n) {
        this();
        System.out.println("child with parameter");
    }
}

public class InheritanceDemo {
    public static void main(final String[] args) throws ClassNotFoundException {
        Child c = new Child(5);
    }
}
