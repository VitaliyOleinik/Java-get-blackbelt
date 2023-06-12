package regex;

public class PrintfExample {

    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary*(1+emp.bonusPct));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Vit", "O", 12345, 0.15);
        Employee emp2 = new Employee(2, "Petr", "Oasdas", 1234, 0.11);
        Employee emp3 = new Employee(3, "Var", "O32rea", 123, 0.12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",
                emp1.id, emp1.name, emp1.surname, emp1.salary*(1+emp1.bonusPct));

        System.out.println(newString);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
