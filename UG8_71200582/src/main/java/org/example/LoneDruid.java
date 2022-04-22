package org.example;

public class LoneDruid extends Hero implements Upgradeable,Summoner{
    private int KillCreep;
    private int level;

    public LoneDruid(){

        super("Lone Druid",1800,140);
    }


    @Override
    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("KillCreep : "+this.KillCreep);
    }

    @Override
    public void attack(Character Creep) {
            Creep.health -= this.damage;
            if(Creep.isDie()){
                this.KillCreep += 1;
            }
        }

    @Override
    public void upgrade() {
        if(KillCreep >=3){
            this.level += 1;
            this.KillCreep -= 3;
            this.name = this.name+" "+ this.level;
            this.damage += 20;
        }

    }

    @Override
    public SpiritBear summon() {
        return new SpiritBear(this);

    }
}





