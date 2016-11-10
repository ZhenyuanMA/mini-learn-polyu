package domain;

public class General extends Staff {
    /**
     * The constructor of General, General is a subclass of Staff
     * @param name
     * @param salary
     */
    public General(String name, double salary) {
        super(name, salary);
    }

    /**
     * This method increases the salary of Staffs which belong to General category
     */
    public void increaseSalary() {
        salary = salary * 1.01 + Math.pow(salary, 0.1);
    }
}
