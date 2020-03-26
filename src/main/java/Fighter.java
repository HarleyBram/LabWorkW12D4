import Behaviours.IWeapon;

public abstract class Fighter extends Player  {


    protected Weapon weapon;

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapon = new Weapon();
    }

    public void attack(){
        System.out.println("Take that!");
    }

}
