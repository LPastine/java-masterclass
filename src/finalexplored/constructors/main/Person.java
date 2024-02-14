package finalexplored.constructors.main;

public record Person(String name, String dob) {

    // Explicit Canonical Constructor
//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/');
//    }

    public Person(Person person) {
        this(person.name, person.dob);
    }

    // Compact Constructor
    public Person {
        if (dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-', '/');


    }
}
