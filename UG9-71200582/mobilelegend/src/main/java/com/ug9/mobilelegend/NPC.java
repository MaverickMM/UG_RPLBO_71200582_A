package com.ug9.mobilelegend;

public class NPC extends Character{
    public NPC(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attack(Character enemy) {
        if(enemy.getHealth() <=0){
            enemy.setHealth(0);
            enemy.setDie(true);
        }
        if (enemy instanceof Ranged || enemy instanceof Melee){
            int dmg = getDamage() + 100;
            int enemhealth = enemy.getHealth();
            enemy.setHealth(enemhealth - dmg);


            System.out.println(getName() + " memberikan serangan ke " +enemy.getName() +" sebesar " + dmg);

        }

    }


    @Override
    public void attackInformation(Character enemy, int damage) {
        super.attackInformation(enemy, damage);

    }
}
