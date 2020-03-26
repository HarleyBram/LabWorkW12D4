import Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 16);
    }

    @Test
    public void conanBattleCry(){
        assertEquals("To crush your enemies, to see them driven before you, and to hear the lamentations of their women", barbarian.BattleCry());
    }
}
