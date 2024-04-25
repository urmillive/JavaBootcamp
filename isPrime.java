import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int n;
        int c = 2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Neither Prime not Composite");
        }
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c++;
        }
        System.out.println("Prime");
    }
}
