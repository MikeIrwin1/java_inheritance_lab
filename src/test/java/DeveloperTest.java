import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mark", "NI 13 14 15", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Mark", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI 13 14 15", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(21000, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus());

    }

    @Test
    public void setName(){
        developer.setName("Jeff");
        assertEquals("Jeff", developer.getName());
    }

    @Test
    public void cantSetNameVoid(){
        developer.setName("");
        assertEquals("Mark", developer.getName());
    }
}
