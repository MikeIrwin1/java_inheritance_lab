import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Mark", "NI 12 13 14", 50000, "Codeclan", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Mark", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI 12 13 14", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Codeclan", director.getDept());
    }

    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(51000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus());
    }

    @Test
    public void raiseSalaryCantBeNegative(){
        director.raiseSalary(-1000);
        assertEquals(50000, director.getSalary());
    }
}
