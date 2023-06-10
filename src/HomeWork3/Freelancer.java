package HomeWork3;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    private final int workingDays;
    private final int workingHour;

    {
        workingDays = 21;
        workingHour = 8;
    }

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return workingHour * workingDays * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d лет; ЗП (почасовая): %.2f (руб.), " +
                        "ЗП за %d раб. дней: %.2f (руб.)",
                surname, name, age, salary, workingDays, calculateSalary());
    }
}