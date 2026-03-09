package Assessment2.module4;

public class StringImmutableDemo {
    public static void main(String[] args) {

        String s = "Hello";
        System.out.println("Original String: " + s);

        s.concat(" World");   // trying to modify string

        System.out.println("After concat(): " + s);
    }
}
