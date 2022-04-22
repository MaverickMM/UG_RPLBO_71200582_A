package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Creep Creep1 = new Creep("Creep1",200,20);
        Creep Creep2 = new Creep("Creep2",200,20);
        Creep Creep3 = new Creep("Creep3",200,20);

        LoneDruid LoneDruid1 = new LoneDruid();
        Warlock Warlock1 = new Warlock();

        SpiritBear Bear1 = LoneDruid1.summon();
        Golem Golem1 = Warlock1.summon();

        Creep1.attack(Bear1);
        Creep1.attack(Warlock1);

        LoneDruid1.attack(Creep1);
        Bear1.attack(Creep2);
        Warlock1.attack(Creep3);
        Golem1.attack(Creep1);
        Golem1.attack(Creep2);

        Golem miniGolem = Golem1.summon();

        LoneDruid1.showCharacterInfo();
        System.out.println(" ");
        Bear1.showCharacterInfo();
        System.out.println(" ");
        miniGolem.showCharacterInfo();

    }
}
