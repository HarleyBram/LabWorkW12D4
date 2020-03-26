package Weapons;

import Behaviours.IWeapon;
import Enemys.Enemy;

public abstract class Weapon implements IWeapon {
    int damageValue;

    public Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public String attack(){
    // check health point and remove damage value from health points
        return "Attack";


    };
}
