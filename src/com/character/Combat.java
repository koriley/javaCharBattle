package com.character;

public class Combat {
    public static void combat(Player player1, Player player2){
        int p1Str = player1.getStr();
        int p1Dex = player1.getDex();
        int p1HP = player1.getHp();

        int p2Str = player2.getStr();
        int p2Dex = player2.getDex();
        int p2HP = player2.getHp();

        int playerAttack = 0;
        int playerDefend = 0;

        while(p1HP > 0 && p2HP > 0) {
            String first = initiative(p1Dex, p2Dex);
            System.out.println(first);
            System.out.println("player 1 hp = "+p1HP+" player 2 hp = "+p2HP);
            switch (first) {
                case "player1":
                    resolve(player1, p1Str, player2, p2Dex);


                    break;
                case "player2":
                    resolve(player2, p2Str, player1, p1Dex);

                    break;
            }
            p1HP = player1.getHp();
            p2HP = player2.getHp();
        }


    }

    public static String initiative(int p1Dex, int p2Dex){
        int p1Initiative = (int)(Math.random()*20)+1+p1Dex;
        int p2Initiative = (int)(Math.random()*20)+1+p2Dex;
        if(p1Initiative > p2Initiative){
            return "player1";
        }
        if(p1Initiative == p2Initiative){
            initiative(p1Dex, p2Dex);
        }
        return "player2";
    }

    private static void resolve(Player attackPlayer, int str, Player defPlayer, int dex){
        int attack = (int)(Math.random()*20)+1+str;
        int def = (int)(Math.random()*20)+1+dex;
        int defHP = defPlayer.getHp();
        if(attack >= def){
            int damage = (int)(Math.random()*2)+1;
            damage = damage +str/2;
            int newHp = defHP - damage;
            defPlayer.setHp(newHp);
            System.out.println(attackPlayer.getName()+" hit "+defPlayer.getName()+" for "+damage+" points of damage.");
            return;
        }
        System.out.println(attackPlayer.getName()+" Misses "+defPlayer.getName()+".");
    }
}
