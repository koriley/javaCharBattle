package com.character;

public class Combat {
    public static void combat(Player player1, Player player2){
        int p1Str = player1.getStr();
        int p1Dex = player1.getDex();
        int p1HP = player1.getHp();
        int p1Fat = player1.getFatigue();

        int p2Str = player2.getStr();
        int p2Dex = player2.getDex();
        int p2HP = player2.getHp();
        int p2Fat = player2.getFatigue();


        while(p1HP > 0 && p2HP > 0) {
            String first = initiative(player1, player2);
            System.out.println(first+" has initiative");

            switch (first) {
                case "player 1":
                    setFatStats(player1);
                    resolve(player1, player2);
                    p1Fat += 1;
                    player1.setFatigue(p1Fat);
                    System.out.println("p1fat = "+p1Fat);

                    break;
                case "player 2":
                    setFatStats(player2);
                    resolve(player2, player1);
                    p2Fat += 1;
                    player2.setFatigue(p2Fat);
                    System.out.println("p2fat = "+p2Fat);
                    break;
            }
            p1HP = player1.getHp();
            p2HP = player2.getHp();
            System.out.println("player 1 hp = "+p1HP+" \nplayer 2 hp = "+p2HP);
        }
        if(p1HP > p2HP){
            System.out.println("Winner is player 1");
        }else{
            System.out.println("winner is player 2");
        }

    }

    public static String initiative(Player attacker, Player def){
        int p1Dex = attacker.getDex();
        int p2Dex = def.getDex();
        if(p2Dex<=0){
            p2Dex =0;
        }
        if(p1Dex <=0){
            p1Dex = 0;
        }
        int p1Initiative = (int)(Math.random()*20)+1+(p1Dex/2);
        int p2Initiative = (int)(Math.random()*20)+1+(p2Dex/2);
        if(p1Initiative > p2Initiative){

            return "player 1";
        }
        if(p1Initiative == p2Initiative){
            initiative(attacker, def);
        }
        return "player 2";
    }

    private static void resolve(Player attackPlayer, Player defPlayer){
        int str = attackPlayer.getStr();
        int dex = defPlayer.getDex();
        int attack = (int)(Math.random()*20)+1;
        attack += str;
        int def = (int)(Math.random()*20)+1+dex;
        def += dex;
        int defHP = defPlayer.getHp();
        if(attack >= def){
            int damageBase = attackPlayer.getDamageBase();
            int damage = (int)(Math.random()*damageBase)+1;
            damage = damage + (str/2);
            if(damage < 2){
                damage = 2;
            }

            int newHp = defHP - damage;
            defPlayer.setHp(newHp);
            System.out.println(attackPlayer.getName()+" hit "+defPlayer.getName()+" for "+damage+" points of damage.");
            return;
        }
        System.out.println(attackPlayer.getName()+" Misses "+defPlayer.getName()+".");
    }

    private static void setFatStats(Player player){
        int pFat = player.getFatigue();
        if(pFat % 4 == 0){
            int str = player.getStr();
            int dex = player.getDex();
            str -= 1;
            dex -= 1;
            player.setStr(str);
            player.setDex(dex);
            Weapons.weaponUse(player);
        }
    }
}
