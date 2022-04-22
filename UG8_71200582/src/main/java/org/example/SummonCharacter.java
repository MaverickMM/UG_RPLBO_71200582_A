package org.example;

public abstract class SummonCharacter extends Hero{
    protected Summoner owner;

    public SummonCharacter(String name, int hp, int damage, Summoner Summon){
        super(name,hp,damage);
        this.owner = Summon;
    }


}
