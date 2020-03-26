import Enemys.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {
    Troll troll;
    @Before
    public void before(){
        troll = new Troll("Tony", 12);
    }

    @Test
    public void testHasName(){
        assertEquals("Tony", troll.getName());
    }

    @Test
    public void testHasHealthPoints(){
        assertEquals(12, troll.getHealthPoints());
    }

    @Test
    public void testTakesDamage(){
        troll.takeDamage(4);
        assertEquals(8, troll.getHealthPoints());

    }
}
