package domain;

public class Academic extends Staff {
    /**
     * The constructor of Academic, Academic is a subclass of Staff
     * @param name
     * @param salary
     */
    public Academic(String name, double salary) {
        super(name, salary);
    }

    /**
     * This method increases the salary of Staffs which belong to Academic category
     */
    public void increaseSalary() {
        salary = salary * 1.03 + Math.pow(salary, 0.3);
    }
}
