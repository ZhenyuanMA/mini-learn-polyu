package domain;

public class Teaching extends Staff {
    /**
     * The constructor of Teaching, Teaching is a subclass of Staff
     * @param name
     * @param salary
     */
    public Teaching(String name, double salary) {
        super(name, salary);
    }

    /**
     * This method increases the salary of Staffs which belong to Teaching category
     */
    public void increaseSalary() {
        salary = salary * 1.02 + Math.pow(salary, 0.2);
    }
}
