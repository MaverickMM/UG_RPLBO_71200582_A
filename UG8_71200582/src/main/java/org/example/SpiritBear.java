package org.example;

public class SpiritBear extends SummonCharacter {
    private int kill;

    public SpiritBear(LoneDruid summon) {
            super("Spirit Bear",1000,130,summon);

        }

    @Override
    public void attack(Character Creep) {
        Creep.health -= this.damage;
        super.attack(Creep);
    }
}
