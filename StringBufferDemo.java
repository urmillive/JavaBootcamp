public class StringBufferDemo {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        // Create two threads that will access and modify the StringBuffer object

        Thread t1 = new Thread(() -> {
            sb.append("Hello, Ram");
        });

        Thread t2 = new Thread(() -> {
            sb.append(" Hello, Shyam");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.toString());
    }
}
