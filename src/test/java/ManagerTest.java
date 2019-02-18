import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jeff", "NI 12 13 14", 30000, "devTeam");
    }

    @Test
    public void hasName(){
        assertEquals("Jeff", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NI 12 13 14", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("devTeam", manager.getDept());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(31000, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus());

    }

}
