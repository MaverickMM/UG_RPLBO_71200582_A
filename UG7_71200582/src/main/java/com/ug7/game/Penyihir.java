package com.ug7.game;

public class Penyihir extends Karakter {
   private boolean isAbilityReady;

   public Penyihir(Player player) {
      super(player);
   }

   public void buyWeapon(int weapon) {
      System.out.println("Daftar senjata:\n1. Pisau\n2. Tongkat Sihir\n3. Tongkat\n4. Katana");
      System.out.println("Pilihan senjata: " + weapon);
      if (weapon != 2 && weapon != 3) {
         System.out.println("Sebagai penyihir kamu hanya boleh membeli tongkat/tongkat sihir!");
      } else {
         super.buyWeapon(weapon);
      }
   }

   public void abilityAttack(Karakter karakter) {
      if (this.isAbilityReady) {
         int heal;
         if (this.isWalk()) {
            heal = karakter.getHP() / 2;
         } else {
            heal = 100;
         }

         System.out.println("Tidak semudah itu, " + karakter.getPlayer().getUsername() + "!");
         super.receiveHP(heal);
      } else {
         System.out.println("Ability belum aktif!");
      }

   }

   public void normalAttack(Karakter karakter) {
       int damage;
      if (this.isWalk()) {
          if (this.getWeapon() == 1) {
              damage = 20;
          } else if (this.getWeapon() == 2) {
              damage = 60;
          } else if (this.getWeapon() == 3) {
              damage = 25;
          } else if (this.getWeapon() == 4) {
              damage = 50;
          }else{
              damage = 0;
          }


          damage = (int)((double)damage * 1.5D);
          karakter.receiveDamage(damage);
         if (karakter.getHP() < 50) {
            this.isAbilityReady = true;
         }

         if (karakter.getHP() == 0) {
            this.getPlayer().levelUp();
         }
      } else {
         super.normalAttack(karakter);
      }

   }

   public void walk(boolean type) {
      if (!type) {
         System.out.println(this.getPlayer().getUsername() + " terbang! (Lari)");
      }

      super.walk(type);
   }

   public void getInfo() {
      System.out.println("[Karakter Penyihir]");
      super.getInfo();
   }
}
