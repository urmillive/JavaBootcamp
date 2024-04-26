class Outer {
    private int x = 10;

    class Inner {
        void innerMethod() {
            int x = 20;
            System.out.println("Inner class method");
            System.out.println("Outer variable: " + x);
        }
    }

    void outerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

}

public class InnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
