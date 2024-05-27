package lesson23.SortPerson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olivia", 65.2));
        people.add(new Person("Ethan", 72.8));
        people.add(new Person("Sophia", 58.5));
        people.add(new Person("Liam", 70.0));
        people.add(new Person("Ava", 60.0));
        people.add(new Person("Noah", 68.7));
        people.add(new Person("Isabella", 55.9));
        people.add(new Person("Lucas", 73.5));
        people.add(new Person("Mia", 60.0));
        people.add(new Person("Alexander", 66.4));


        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int weightCompare = Double.compare(p1.getWeight(), p2.getWeight());
                if (weightCompare != 0) {
                    return weightCompare;
                }
                return p1.getName().compareTo(p2.getName());
            }
        });

        // Now 'people' is sorted by weight, and then by name
        System.out.printf("%-10s %-10s%n","Name", "Weight");
        for (Person person: people) {
            System.out.printf("%-10s %-10.2f%n",person.getName(), person.getWeight());
        }
    }
}


