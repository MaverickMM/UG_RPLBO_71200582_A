package org.example;

public class Creep extends Character implements AttackingHero{

    public Creep(String name,int hp,int dmg){
        super(name,hp,dmg);
    }


    @Override
    public void attack(Character Hero) {
        Hero.health -= this.damage;
    }

    @Override
    public void attacked(int a) {

    }
}
