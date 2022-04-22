package org.example;

public class Warlock extends Hero implements Summoner,Upgradeable{
    private int numOfSummon;
    public Warlock(){
        super("Warlock",700,80);
    }

    @Override
    public Golem summon() {
        this.numOfSummon += 1;
        return new Golem(this);

    }

    @Override
    public void attack(Character Creep) {
        super.attack(Creep);
    }

    @Override
    public void upgrade() {

    }
}
