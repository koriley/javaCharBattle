package com.character;

public class Combat {
    public static void combat(Player player1, Player player2){

        int p1HP = player1.getHp();
        int p1Fat = player1.getFatigue();
        int p2HP = player2.getHp();
        int p2Fat = player2.getFatigue();
        int round = 1;
        while(p1HP > 0 && p2HP > 0) {
            System.out.println("-----------Round "+round+"------------");
            String first = initiative(player1, player2);
            System.out.println(first+" has initiative");

            switch (first) {
                case "player 1":
                    Negitive.setFatStats(player1, round);
                    resolve(player1, player2);
                    p1Fat += 1;
                    player1.setFatigue(p1Fat);
                    System.out.println(player1.getName()+"pFat is "+player1.getFatigue());
                    break;
                case "player 2":
                    Negitive.setFatStats(player2, round);
                    resolve(player2, player1);
                    p2Fat += 1;
                    player2.setFatigue(p2Fat);
                    System.out.println(player2.getName()+"pFat is "+player2.getFatigue());
                    break;
            }
            p1HP = player1.getHp();
            p2HP = player2.getHp();
            System.out.println("player 1 hp = "+p1HP+" \nplayer 2 hp = "+p2HP);
            System.out.println("current damage: player 1 = "+player1.getDamageBase()+" and player 2 = "+player2.getDamageBase());
            System.out.println("player 1 -> str: "+player1.getStr()+" dex: "+player1.getDex());
            System.out.println("player 2 -> str: "+player2.getStr()+" dex: "+player2.getDex());
            round += 1;
            System.out.println("--------------------------------");
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
            int damage = (int)(Math.random()*20)+1;
            damage = damage + (str/2) + damageBase;
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


}
