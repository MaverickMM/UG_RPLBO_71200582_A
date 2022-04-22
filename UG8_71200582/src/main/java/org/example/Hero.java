package org.example;

public class Hero extends Character implements AttackingCreep{


    public Hero(String name, int hp,int damage) {
        super(name,hp,damage);
    }

    @Override
    public void attacked(int a) {

    }

    @Override
    public void attack(Character Creep) {

    }
}
