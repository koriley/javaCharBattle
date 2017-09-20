package com.character;

public class Player {
    private int str;
    private int dex;
    private int hp;
    private String name;
    private int armor;
    private int damageBase;
    private int weaponSize;
    private int fatigue;



    public Player(String name) {
        this.str = (int)(Math.random()*100)+1;
        this.dex = (int)(Math.random()*100)+1;
        this.hp = (int)(Math.random()*100)+1;
        this.name = name;
        this.fatigue = 0;
        //sets the weapon base damage

        //System.out.println("player created");
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamageBase() {
        return damageBase;
    }

    public void setDamageBase(int damageBase) {
        this.damageBase = damageBase;
    }

    public int getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(int weaponSize) {
        this.weaponSize = weaponSize;
    }
}
