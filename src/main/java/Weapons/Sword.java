package Weapons;

import Enemys.Enemy;

public class Sword extends Weapon {
    public Sword(int damageValue) {
        super(damageValue);
    }

    public String attack(Enemy enemy) {

        enemy.takeDamage(damageValue);
        return "Stabbing with A Sword!!";
    }


}
