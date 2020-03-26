import Enemys.Enemy;
import Enemys.Orc;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SwordTest {
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        sword = new Sword(6);
        orc = new Orc("Olly", 10);
    }

    @Test
    public void testAttackBySword(){
        sword.attack(orc);
        assertEquals(4, orc.getHealthPoints());
    }

}
