package com.character;

public class Weapons {



    public static void weapons(Player player) {
        int str = player.getStr();
        int size;
        int damage;
        if(str <= 4){
            size = 1;
            player.setWeaponSize(size);
            damage = (int)(Math.random()*4)+2;
            player.setDamageBase(damage);
        }
        if(str <= 7 && str > 4){
            size = 2;
            player.setWeaponSize(size);
            damage = (int)(Math.random()*6)+4;
            player.setDamageBase(damage);
        }
        if(str <= 10 && str > 7){
            size = 3;
            player.setWeaponSize(size);
            damage = (int)(Math.random()*8)+6;
            player.setDamageBase(damage);
        }
        //represents the max damage of the weapon.


    }

    public static void weaponUse(Player player){
        int str = player.getStr();
        int weaponsize = player.getWeaponSize();
        if(str < 4 && weaponsize > 1){
            System.out.println(player.getName()+"'s strength is "+str);
            System.out.println(player.getName()+" drops weapon");
            player.setDamageBase(2);
            player.setWeaponSize(0);
        }
        if(str < 7 && weaponsize > 2){
            System.out.println(player.getName()+"'s strength is "+str);
            System.out.println(player.getName()+" drops weapon");
            player.setDamageBase(2);
            player.setWeaponSize(0);
        }
        if(str < 10 && weaponsize > 3){
            System.out.println(player.getName()+"'s strength is "+str);
            System.out.println(player.getName()+" drops weapon");
            player.setDamageBase(2);
            player.setWeaponSize(0);
        }
        if(str <=0){
            System.out.println(player.getName()+" str is "+player.getStr());
            int hp = player.getHp();
            hp -= 1;
            player.setHp(hp);
            System.out.println(player.getName()+" is tired and hp penalty is now: "+player.getHp());
        }
    }


}
