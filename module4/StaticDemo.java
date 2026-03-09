package Assessment2.module4;
 class Student {

        static String college = "ABC College"; // static variable
        int id;
        String name;

        static void displayCollege() { // static method
            System.out.println("College: " + college);
        }

        Student(int i, String n) {
            id = i;
            name = n;
        }

        void display() {
            System.out.println(id + " " + name + " " + college);
        }
    }

    public class StaticDemo {
        public static void main(String[] args) {

            Student.displayCollege();

            Student s1 = new Student(1, "Ram");
            Student s2 = new Student(2, "Shyam");

            s1.display();
            s2.display();
        }
    }

