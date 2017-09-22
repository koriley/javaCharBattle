package com.character;

public class Weapons {



    public static void weapons(Player player) {
        int str = player.getStr();
        int size = 0;
        int damage;
        if(str <= 4){
            size = 1;
            player.setWeaponSize(size);

        }
        if(str > 4 && str <= 7){
            size = (int)(Math.random()*2)+1;
            player.setWeaponSize(size);

        }
        if(str > 7){
            size = (int)(Math.random()*3)+1;
            player.setWeaponSize(size);

        }
        //represents the max damage of the weapon.
        switch(size){
            case 1:
                damage = (int)(Math.random()*4)+2;
                player.setDamageBase(damage);
                break;
            case 2:
                damage = (int)(Math.random()*6)+4;
                player.setDamageBase(damage);
                break;
            case 3:
                damage = (int)(Math.random()*8)+6;
                player.setDamageBase(damage);
                break;
            case 0:
                System.out.println("weapon error");
        }

    }

    public static void weaponDrop(Player player){


            System.out.println(player.getName()+" drops weapon");
            player.setDamageBase(2);
            player.setWeaponSize(0);


    }


}
