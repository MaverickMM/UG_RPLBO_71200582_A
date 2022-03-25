package com.ug7.game;

public class Karakter {
   private final Player player;
   private int HP = 100;
   private int money = 5000;
   private int weapon = 0;
   private boolean isWalk = false;

   public Karakter(Player player) {
      this.player = new Player(player.getUsername(), player.getPassword());
   }

   public void buyWeapon(int weapon) {
      if (weapon > 0 && weapon < 5) {
         this.weapon = weapon;
         short price;
         switch(weapon) {
         case 1:
            price = 500;
            break;
         case 2:
            price = 3000;
            break;
         case 3:
            price = 2000;
            break;
         case 4:
            price = 4000;
            break;
         default:
            price = 0;
         }

         if (this.money < price) {
            System.out.println("Maaf uang kamu tidak mencukupi!");
         } else {
            this.money -= price;
            System.out.println("Berhasil membeli senjata! Uang sekarang: " + this.getMoney());
         }
      } else {
         System.out.println("Pilihan yang kamu masukkan salah!");
      }
   }

   public void abilityAttack(Karakter karakter) {
      karakter.receiveDamage(0);
   }

   public void normalAttack(Karakter karakter) {
      byte damage;
      if (this.weapon == 1) {
         damage = 20;
      } else if (this.weapon == 2) {
         damage = 60;
      } else if (this.weapon == 3) {
         damage = 25;
      } else if (this.weapon == 4) {
         damage = 50;
      } else {
         damage = 0;
      }

      karakter.receiveDamage(damage);
   }

   public void walk(boolean type) {
      this.isWalk = type;
   }

   public void getInfo() {
      System.out.println("Username: " + this.getPlayer().getUsername());
      System.out.println("Level: " + this.getPlayer().getLevel());
      System.out.println("Money: " + this.getMoney());
      String isDie = "";
      if (this.getHP() <= 0) {
         isDie = "<<Mati>>";
      }

      System.out.println("HP: " + this.getHP() + " " + isDie);
      String weapon;
      if (this.weapon == 1) {
         weapon = "Pisau";
      } else if (this.weapon == 2) {
         weapon = "Tongkat Sihir";
      } else if (this.weapon == 3) {
         weapon = "Tongkat";
      } else if (this.weapon == 4) {
         weapon = "Katana";
      } else {
         weapon = "tangan kosong";
      }

      System.out.println("Weapon: " + weapon);
      String movement;
      if (this.isWalk) {

         movement = "Walking";
      } else {

         movement = "Running";
      }

      System.out.println("Movement: " + movement);
      System.out.println();
   }


   public void receiveDamage(int damageKtr) {
      this.HP = this.HP - damageKtr;
      System.out.println(this.getPlayer().getUsername() + " terkena serangan! Sisa HP " + this.getPlayer().getUsername() + ": " + this.getHP());
      if (this.getHP() <= 0) {
         this.HP = 0;
         System.out.println(this.getPlayer().getUsername() + " mati!");
      }

   }

   public void receiveHP(int hp) {
      this.HP += hp;
      if (this.getHP() > 100) {
         this.HP = 100;
      }
      if (this.getHP() <= 0) {
         System.out.print("Aku kembali Hidup - ");
         System.out.println("HP sekarang: " + this.getHP());
      }

   }
   public boolean isWalk() {
      return this.isWalk;
   }


   public Player getPlayer() {
      return player;
   }

   public int getHP() {
      return HP;
   }

   public int getMoney() {
      return money;
   }

   public int getWeapon() {
      return weapon;
   }
}
