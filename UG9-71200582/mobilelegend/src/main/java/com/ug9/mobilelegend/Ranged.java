package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill{
    public Ranged(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void ultimate() {
        addDamage(150);
    }

    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if (enemy instanceof Creep){
            setHealthBonus(150);
        }
        System.out.println(getName()+" memberikan serangan ke "+enemy.getName()+" sebesar " + getDamage());
    }
}
