package HomeWork3;

import java.util.Comparator;

public class SalaryComparator<E> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
