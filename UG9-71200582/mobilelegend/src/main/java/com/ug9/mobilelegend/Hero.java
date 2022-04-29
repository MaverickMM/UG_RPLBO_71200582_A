package com.ug9.mobilelegend;

public abstract class Hero extends Character{
    private int healthBonus;
    private int level=1;
    private int healthMax=this.getHealth();
    private int lifeSteal=50;

    public Hero(String name, int damage, int health) {
        super(name, damage, health);
    }

    public void addDamage(int damage){
        System.out.println(getName()+" mengaktifkan ulti. Damage saat ini bertambah " + damage);
        int dmg = damage + getDamage();
         setDamage(dmg);

    }

    @Override
    public void attack(Character enemy) {

        if(enemy.getHealth() <=0){
            enemy.setHealth(0);
            enemy.setDie(true);
        }
        if(enemy.isDie()){
            level+=1;
            if (enemy instanceof Ranged || enemy instanceof Melee){
                lifeSteal+=150;
                int lsteal = getHealth() + lifeSteal;
                this.setHealth(lsteal);

            }
            else if (enemy instanceof Minion || enemy instanceof Creep){
                healthBonus += 1;
                int lsteal = getHealth() + lifeSteal;
                this.setHealth(lsteal);

            }

        }
        int dmg = getDamage() ;
        int enemhealth = enemy.getHealth();
        enemy.setHealth(enemhealth + healthBonus - dmg);

    }


    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;

    }

    public int getLevel() {
        return level;
    }

    @Override
    public void attackInformation(Character enemy, int damage) {
        super.attackInformation(enemy, damage);
    }

    }

