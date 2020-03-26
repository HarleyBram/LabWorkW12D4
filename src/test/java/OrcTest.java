import Enemys.Orc;
import Enemys.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {
    Orc orc;
    @Before
    public void before(){
        orc = new Orc("Gary", 12);
    }

    @Test
    public void testHasName(){
        assertEquals("Gary", orc.getName());
    }

    @Test
    public void testHasHealthPoints(){
        assertEquals(12, orc.getHealthPoints());
    }

    @Test
    public void testTakesDamage(){
        orc.takeDamage(4);
        assertEquals(8, orc.getHealthPoints());

    }

}
