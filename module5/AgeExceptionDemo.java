package Module5;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new Exception("Age is less than 18. Not eligible.");
            } else {
                System.out.println("Eligible.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
