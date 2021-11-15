package com.company.Task47;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> store_list = new LinkedList<>();
        store_list.add(this.name);
        store_list.add(String.valueOf((this.hitPoints)));
        store_list.add(String.valueOf((this.strength)));
        store_list.add(this.weapon);
        return store_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void read(List<String> list_) {
        if (list_ != null && list_.size() > 0) {
            this.name = list_.get(0);
            this.hitPoints = Integer.parseInt(list_.get(1));
            this.strength = Integer.parseInt(list_.get(2));
            this.weapon = list_.get(3);
        }
    }


    @Override
    public String toString() {
        return "Player->" +
                "name=>" + name + "\n" +
                "hitPoints=>" + hitPoints + "\n" +
                "strength=>" + strength + "\n" +
                "weapon=>'" + weapon;
    }

}
