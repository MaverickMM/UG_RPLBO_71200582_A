package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill{
    public Melee(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {
        addDamage(100);

    }

    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if (enemy instanceof Creep){
            setHealthBonus(200);
            super.attack(enemy);
        }

        System.out.println(getName()+" memberikan serangan ke "+enemy.getName()+" sebesar " + getDamage());
    }

}
