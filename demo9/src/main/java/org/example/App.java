package org.example;

import org.example.Spring.CreateFile;
import org.example.Spring.SpringConfig;
import org.example.Spring.Wizard;
import org.example.Test.Wizard_h;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        Wizard wizard = context.getBean(("getWizard"),Wizard.class);
//        System.out.println(wizard.getName());
//        System.out.println(wizard.getSurname());

//
//        URL url = new URL("https://www.javatpoint.com/URL-class");
//        System.out.println(url.getHost()); // name directory
//        URLConnection urlcon = url.openConnection();
//        System.out.println(urlcon.getContent());
//        InputStream stream = urlcon.getInputStream();
//        int i;
//        while ((i = stream.read()) != -1) {
//            System.out.print((char) i);
//        }
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        CreateFile createFile = context.getBean(("getCreateFile"),CreateFile.class);
//        System.out.println(createFile.getUrl());


        Wizard_h wizard = new Wizard_h();



//        CreateFile createFile = context.getBean(("getCreateFile"),CreateFile.class);
//        System.out.println(createFile.getUrl());
    }
}
