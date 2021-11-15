package com.company.Task49;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
     default void task(String file){
        System.out.println(file);
    };
}
