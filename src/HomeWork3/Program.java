package HomeWork3;


import java.util.Arrays;
import java.util.Random;

public class Program {


    static Random r = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     */
    static Employee genEmployee() {
        String[] n = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] s = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary;
        if (r.nextInt(2) == 1) {
            salary = r.nextInt(20000, 80000);
            return new Worker(n[r.nextInt(n.length)], s[r.nextInt(s.length)], r.nextInt(18, 66), salary);
        } else {
            salary = r.nextInt(500, 1000);
            return new Freelancer(n[r.nextInt(n.length)], s[r.nextInt(s.length)], r.nextInt(18, 66), salary);
        }
    }

    static void showE(Employee[] employees) {
        for (Employee el : employees) System.out.println(el);
        System.out.println("\n");
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) employees[i] = genEmployee();

        Arrays.sort(employees, new NameComparator<Employee>());
        System.out.println("ПО ФАМИЛИИ + ИМЕНИ: ");
        showE(employees);

        Arrays.sort(employees, new AgeComparator<Employee>());
        System.out.println("ПО ВОЗРАСТУ И УР. ЗП: ");
        showE(employees);

        Arrays.sort(employees, new SalaryComparator<Employee>().reversed());
        System.out.println("Сортировка по заработной плате");
        showE(employees);

    }

}