package org.example;

import World.Kind;
import World.Me;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static List<String> list;
    private static List<Me> heroes = new ArrayList<>();
    public static void main( String[] args ) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Me me = context.getBean("Ivan", Me.class);

        me.getHumanWork();
        me.getHumanStatus();

        me.Destroy();
//
//        getFileText();
//
//        for(String str : list){
//            if(Kind.dwarf.toString() == "dwarf"){
//                Me dwarf = context.getBean(("Ivan"),Me.class);
//
//            }else if(Kind.wizard.toString() == "wizard"){
//
//            }
//        }
    }

    public static void getFileText() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/World/text.txt"));
        String str;
        list= new ArrayList<>();
        while ((str = bufferedReader.readLine())!=null){
            list.add(str);
        }
    }
}
