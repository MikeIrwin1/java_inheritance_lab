import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
         databaseAdmin = new DatabaseAdmin("Mark", "NI 13 14 15", 20000);
    }

    @Test
    public void hasName(){
        assertEquals("Mark", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI 13 14 15", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, databaseAdmin.payBonus());

    }
}
