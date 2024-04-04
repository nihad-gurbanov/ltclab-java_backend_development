package lesson12.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setAge(-10);


        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setName("John");
        person2.setAge(25);

        Person person3 = new Person();
        person3.setName("Jane");
        person3.setAge(30);

        // Checking hash codes
        System.out.println("Hash code of person1: " + person1.hashCode());
        System.out.println("Hash code of person2: " + person2.hashCode());
        System.out.println("Hash code of person3: " + person3.hashCode());

        // Checking equality
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));
    }
}

