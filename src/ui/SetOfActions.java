package ui;

import domain.*;
import java.util.ArrayList;

public class SetOfActions {

    /**
     * When users click the TA button, the GUI will invoke this method to add a TA object into a list of Staffs.
     * @param st the list which contains all the added staffs
     * @param name the name of the Staff the GUI gets from the name field
     * @param salary the basic salary of the Staff the GUI gets from the salary field
     */
    public static void addTA(ArrayList<Staff> st, String name, double salary) {
        Staff s = new TA(name, salary);
        st.add(s);
    }

    /**
     * When users click the Technician button, the GUI will invoke this method to add a Technician object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addTechnician(ArrayList<Staff> st, String name, double salary) {
        Staff s = new Technician(name, salary);
        st.add(s);
    }

    /**
     * When users click the Professor button, the GUI will invoke this method to add a Professor object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addProfessor(ArrayList<Staff> st, String name, double salary) {
        Staff s = new Professor(name, salary);
        st.add(s);
    }

    /**
     * When users click the RA button, the GUI will invoke this method to add an RA object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addRA(ArrayList<Staff> st, String name, double salary) {
        Staff s = new RA(name, salary);
        st.add(s);
    }

    /**
     * When users click the RS button, the GUI will invoke this method to add an RS object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addRS(ArrayList<Staff> st, String name, double salary) {
        Staff s = new RS(name, salary);
        st.add(s);
    }

    /**
     * When users click the Lecturer button, the GUI will invoke this method to add a Lecturer object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addLecturer(ArrayList<Staff> st, String name, double salary) {
        Staff s = new Lecturer(name, salary);
        st.add(s);
    }

    /**
     * When users click the Officer button, the GUI will invoke this method to add an Officer object into a list of Staffs.
     * @param st
     * @param name
     * @param salary
     */
    public static void addOfficer(ArrayList<Staff> st, String name, double salary) {
        Staff s = new Officer(name, salary);
        st.add(s);
    }

    /**
     * The GUI frequently invokes this method to display the total salaries.
     * @param st the list of all added Staffs
     * @return the total salaries of all the Staffs in the list
     */
    public static double getTotalSalary(ArrayList<Staff> st) {
        double sum = 0;
        for (Staff s : st)
            sum += s.getSalary();
        return sum;
    }

    /**
     * When users click the Increase Salary button, the GUI will invoke this method to increase the salaries of all Staffs,
     * and the new total salaries will be displayed on the GUI
     * @param st the list of all added Staffs
     * @return the new total salaries of all the Staffs in the list after increased
     */
    public static double increaseTotalSalary(ArrayList<Staff> st) {
        for (Staff s : st) {
            s.increaseSalary();
        }
        return getTotalSalary(st);
    }
}
