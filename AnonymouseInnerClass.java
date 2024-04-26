class Tech {
    private int x = 10;

    public void tech() {
        System.out.println(x);
        System.out.println("Tech");
    }
}

public class AnonymouseInnerClass {
    public static void main(String[] args) {
        Tech t = new Tech() {
            @Override
            public void tech() {
                System.out.println("Ram Ram");
                System.out.println(x);
            }

            private int x = 20;
        };
        t.tech();
    }
}
