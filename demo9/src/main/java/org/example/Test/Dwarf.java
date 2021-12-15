package org.example.Test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dwarf implements Human{


    @Override
    public void getWork() {
        System.out.println("Dwarf get work");
    }

}
