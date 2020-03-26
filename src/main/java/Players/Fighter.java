package Players;

public abstract class Fighter extends Player {


    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void attack(){
        System.out.println("Take that!");
    }

}
