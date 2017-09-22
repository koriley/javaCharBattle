package com.character;

public class Negitive {

    public static void tired(Player player){
        int str = player.getStr();
        int dex = player.getDex();
        boolean isTired = player.isTired();
        int weaponSize = player.getWeaponSize();
        int hp = player.getHp();
        if(str <=0 || dex <=0){
                hp -= 1;
                player.setHp(hp);
                if(!isTired){

                    player.setTired(true);
                    System.out.println(player.getName()+" is tired, poor fella.");
                }
        }
        if(isTired && weaponSize >=1){
            int drop = (int)(Math.random()*6)+1;
            if(drop % 3 == 0){
                Weapons.weaponDrop(player);
            }

        }
        if(str <=-10 || dex <=-10){
            hp -= 20;
            player.setHp(hp);
        }
    }

    public static void setFatStats(Player player, int round){
        int pFat = player.getFatigue();

        if(round >=10 && pFat >=8){

            if(pFat % 2 == 0){
                int str = player.getStr();
                int dex = player.getDex();
                str -= 1;
                dex -= 1;
                player.setStr(str);
                player.setDex(dex);

                    tired(player);


            }
        }

    }
}
