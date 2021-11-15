package com.company.Task47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> store_list = new ArrayList<>();
        store_list.add(this.name);
        store_list.add(Integer.valueOf(this.hitPoints).toString());
        store_list.add(Integer.valueOf(this.strength).toString());
        return store_list;
    }

    @Override
    public void read(List<String> list_) {
        if (list_ != null && list_.size() > 0) {
            this.name = list_.get(0);
            this.hitPoints = Integer.parseInt(list_.get(1));
            this.strength = Integer.parseInt(list_.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster->" + "\n" +
                "name=>" + name + "\n" +
                "hitPoints=>" + hitPoints + "\n" +
                "strength=>" + strength;
    }

}
