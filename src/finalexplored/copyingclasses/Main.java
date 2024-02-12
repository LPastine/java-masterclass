package finalexplored.copyingclasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "01/01/1961", null);
        Person jim = new Person("Jim", "02/02/1962", null);
        Person jack = new Person("Jack", "03/03/1963", new Person[]{joe, jim});
        Person jane = new Person("Jane", "04/04/1964", null);
        Person jill = new Person("Jill", "05/05/1965", new Person[]{joe, jim});

        Person[] persons = {joe, jim, jack, jane, jill};

        // Shallow Copy
        Person[] personsCopy = persons.clone();

        // Shallow Copy
        // Person[] personsCopy = Arrays.copyOf(persons, persons.length);

        // Deep Copy
//        Person[] personsCopy = new Person[5];
//        Arrays.setAll(personsCopy, i -> new Person(persons[i]));

//        for (int i = 0; i < personsCopy.length; i++) {
//            personsCopy[i] = new Person(persons[i]);
//        }

        var jillsKids = personsCopy[4].kids();
        jillsKids[1] = jane;

        // Arrays referencing the same records:
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == personsCopy[i]) {
                System.out.println("Equal References " + persons[i]);
            }
        }

        System.out.println(persons[4]);
        System.out.println(personsCopy[4]);
    }
}
