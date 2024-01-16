package nestedclassesandtypes.nestedclasses;

import java.util.Comparator;

// This class doesn't have access to Employee's private fields
public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}
