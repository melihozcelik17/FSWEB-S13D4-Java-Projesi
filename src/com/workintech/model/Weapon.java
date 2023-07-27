package com.workintech.model;

public enum Weapon {
    SWORD(10,1.8) ,
    AXE(15,1.5),
    MACE (20,1.2);
    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }
}
