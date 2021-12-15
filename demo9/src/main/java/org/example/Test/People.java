package org.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class People implements Human {


    @Autowired
    @Qualifier("dwarf")
    private Human human;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human= human;
    }

    @Override
    public void getWork() {

    }
}
