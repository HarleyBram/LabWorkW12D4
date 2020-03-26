package Weapons;

import Enemys.Enemy;

public class Sword extends Weapon {
    public Sword(int damageValue) {
        super(damageValue);
    }

    public String attack(Enemy enemy) {
        return "Stabbing with A Sword!!";
    }


}
