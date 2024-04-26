class Demo {
    class Inner {
        void display() {
            System.out.println("This is from inner class");
        }
    }

    void ok() {
        System.out.println("This is from outer class");
        Inner i = new Inner();
        i.display();
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.ok();
    }
}
