package com.character;

public class Player {
    private int str;
    private int dex;
    private int hp;
    private String name;



    public Player(String name) {
        this.str = (int)(Math.random()*10)+1;
        this.dex = (int)(Math.random()*10)+1;
        this.hp = (int)(Math.random()*100)+1;
        this.name = name;

        //System.out.println("player created");
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
}
