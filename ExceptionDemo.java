
public class 411 {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        int nums[] = new int[5];

        try {
            j = 10 / i;
            System.out.println(nums[100]);
        } catch (ArithmeticException e) {
            System.out.println("Can not devided by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound " + e);
        }
        System.out.println("Bye");
    }
}
