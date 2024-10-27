import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Worker("1111", "yosi", "manor", "mazor", new MyDate(1985, 5, 10), "123", "rnd", new MyDate(2005, 3, 14), 40, 140));
        employees.add(new SalesMan("2222", "alon", "cohen", "tel-aviv", new MyDate(1980, 7, 20), "456", "Sales", new MyDate(2002, 1, 7), 20000));
        employees.add(new Manager("3333", "noam", "david", "789", new MyDate(1970, 3, 15), "789", "Management", new MyDate(1995, 8, 22), 30000));
        employees.add(new SeniorManager("4444", "tomer", "menachem", "1010", new MyDate(1960, 2, 1), "112", "Senior Management", new MyDate(1988, 3, 9), 35000, 40000));

        for (Employee employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + " Salary: " + employee.salary());
        }
    }
}