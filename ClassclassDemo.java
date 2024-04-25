public class ClassclassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class.forName("Demo");
        Demo d = new Demo();
        Demo.namste(d);
    }
}

class Demo {
    int age;
    static String name;

    Demo() {
        this.age = 100;
        System.out.println(this.age);
    }

    static {
        name = "Ram";
        System.out.println(name);
    }

    static void namste(Demo d) {
        System.out.println("this is from static class:" + d.age);
    }
}