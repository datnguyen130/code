package JAVA2.Lab_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));
        System.out.println("Person list : " + people);

        people.sort(Comparator.comparingInt(Person::getAge));

        Collections.sort(people, Comparator.comparing(Person::getAge));
        

    }
}
