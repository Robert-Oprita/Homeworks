package Homework5and6;

public class Person {
    public class Person {
        private String name;
        private int age;

        // Constructorul principal
        public Person(String name) {
            this(name, 0); // Apelăm alt constructor din aceeași clasă
        }

        // Constructorul secundar
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Metoda pentru afișarea datelor personale
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            Person person1 = new Person("Alice");
            person1.displayInfo(); // Va afișa "Name: Alice, Age: 0"

            Person person2 = new Person("Bob", 30);
            person2.displayInfo(); // Va afișa "Name: Bob, Age: 30"
        }
    }
}
