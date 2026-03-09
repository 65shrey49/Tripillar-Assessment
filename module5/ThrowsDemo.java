package Module5;

public class ThrowsDemo {
    static void divide() throws ArithmeticException {
        int a = 10 / 0;
        System.out.println(a);
    }
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }
}
