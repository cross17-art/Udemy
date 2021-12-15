package org.example.Spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;

@Configuration
@ComponentScan("org.example.Spring")
@PropertySource("classpath:data.properties")
public class SpringConfig {


    @Bean
    @Scope("prototype")
    public Wizard getWizard(@Value("${wizard.name}") String name,@Value("${wizard.surname}")String surname){
        return new Wizard(name,surname);
    }
    @Bean
    public CreateFile getCreateFile(@Value("${url.start}") String url) throws MalformedURLException {
        return new CreateFile(url);
    }

}
