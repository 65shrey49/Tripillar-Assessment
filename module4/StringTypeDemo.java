package Assessment2.module4;

public class StringTypeDemo {
        public static void main(String[] args) {

            // String (Immutable)
            String s = "Hello";
            s.concat(" World");
            System.out.println("String: " + s);

            // StringBuilder (Mutable, not thread-safe)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println("StringBuilder: " + sb);

            // StringBuffer (Mutable, thread-safe)
            StringBuffer sf = new StringBuffer("Hello");
            sf.append(" World");
            System.out.println("StringBuffer: " + sf);
        }
    }

