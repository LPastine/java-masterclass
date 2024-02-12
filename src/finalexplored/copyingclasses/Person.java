package finalexplored.copyingclasses;

import java.util.Arrays;

public record Person(String name, String dob, Person[] kids) {
    public Person(Person p) {
        this(p.name, p.dob, p.kids == null ? null : Arrays.copyOf(p.kids, p.kids.length));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
