package Players;

public class Barbarian extends Fighter{

    public Barbarian(String name, int healthPoints) {
        super(name, healthPoints);
    }


    public String BattleCry(){
        return "To crush your enemies, to see them driven before you, and to hear the lamentations of their women";
    }
}
