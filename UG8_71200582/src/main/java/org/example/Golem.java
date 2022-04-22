package org.example;

public class Golem extends SummonCharacter  implements Summoner{
    private int kill = 0;

    public Golem(Summoner summon){
        super("Golem",1000,120, summon);

    }
    @Override
    public void attack(Character Creep) {
        Creep.health -= this.damage;
        if(Creep.isDie()){
            this.kill += 1;
        }
    }

    @Override
    public Golem summon() {
        if(kill >0){
            this.kill -= 1;
            return new Golem(this);
        }
        else {
            return null;
        }

    }
}
