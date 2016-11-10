package test;
import domain.Academic;
import junit.framework.TestCase;


public class AcademicTest extends TestCase {
    private Academic ac;

    public void setUp() {
        ac = new Academic("Eric", 100);
    }

    public void testIncreaseSalary() throws Exception {
        double DELTA = 1e-3;
        ac.increaseSalary();
        assertEquals(106.981, ac.getSalary(), DELTA);
    }


}
