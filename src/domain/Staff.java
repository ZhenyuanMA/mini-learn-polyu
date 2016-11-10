package domain;

abstract public class Staff {
    protected String name;
    protected double salary;

    /**
     * It is the public constructor for any Staff
     * @param name the name of a Staff
     * @param salary the salary of a Staff
     */
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * This method will increase the salary of a Staff,
     * different categories of Staff have different increase rate,
     * this method will be implemented by different categories
     */
    public abstract void increaseSalary();

    /**
     * Return the salary of this Staff
     * @return
     */
    public double getSalary() {
        return salary;
    }
}
