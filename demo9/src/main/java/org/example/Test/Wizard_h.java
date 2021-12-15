package org.example.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example.Test")
public class Wizard_h implements Human {



    @Override
    public void getWork() {
        System.out.println("Wizard_h get work");
    }



}
