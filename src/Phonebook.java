import java.util.ArrayList;

public class Phonebook {
    public class Person {

        private String name;
        private String number;

        public Person(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return this.name;
        }

        public String getNumber() {
            return this.number;
        }
        public String toString() {
            return this.getName() + " номер: " + this.getNumber();
        }
    }

    private ArrayList<Person> phoneBook = new ArrayList<>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.phoneBook.add(person);
    }

    public void printAll() {
        for (Person person : this.phoneBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.phoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "Номер неизвестен!";
    }
}