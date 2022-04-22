package org.example;

public abstract class Character{
    protected String name;
    protected int damage;
    protected int health;

    public Character(){}
    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;


    }

    public abstract void attacked(int a);

    public void showCharacterInfo(){
        System.out.println("Character : "+this.name);
        System.out.println("Health : "+this.health);
        System.out.println("Damage : "+this.damage);
    }

    public boolean isDie(){
        if(this.health <= 0){
            return true;
        }else{
            return false;
        }
    }

}
