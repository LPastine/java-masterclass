package nestedclassesandtypes.innerclasses;

import nestedclassesandtypes.nestedclasses.Employee;

import java.util.Comparator;

public class StoreEmployee extends Employee {
    private String store;

    public StoreEmployee() {}

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    // Example of inner class - A class declared inside another class as well. Note that
    // there isn't a static declaration on this class.
    public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee storeEmployee1, StoreEmployee storeEmployee2) {
            int result = storeEmployee1.store.compareTo(storeEmployee2.store);
            if (result == 0) {
                return new Employee.EmployeeComparator<>(
                        "yearStarted"
                ).compare(storeEmployee1,storeEmployee2);
            }
            return result;
        }
    }
}
