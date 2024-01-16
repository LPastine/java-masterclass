package nestedclassesandtypes.nestedclasses;

import java.util.Comparator;

public class Employee {
    // Example of nested class - A class declared inside another class. Note the
    // static declaration on this class.
    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
                        this.sortType = sortType;
        }

        @Override
        public int compare(Employee employee1, Employee employee2) {
            if (sortType.equalsIgnoreCase("yearStarted")) {
                return employee1.yearStarted - employee2.yearStarted;
            }
            return employee1.name.compareTo(employee2.name);
        }
    }
    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
