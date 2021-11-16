package com.company;

import com.company.Task50.Location;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        // write your code here

        Test test = new Test(1,2,3);
        test.setDigit3(91);
        System.out.println(test.getDigit3());
//
//        Map<String, String> vocabulary = new HashMap<>();
//
//        vocabulary.put("QUIT", "Q");
//        vocabulary.put("SOUTH", "S");
//        vocabulary.put("NORTH", "N");
//        vocabulary.put("WEST", "W");
//        vocabulary.put("EAST", "E");
//
//        locations.put(0, new Location(0, "You are in a ...0"));
//        locations.put(1, new Location(1, "You are in a ...1"));
//        locations.put(2, new Location(2, "You are in a ...2"));
//        locations.put(3, new Location(3, "You are in a ...3"));
//        locations.put(4, new Location(4, "You are in a ...4"));
//        locations.put(5, new Location(5, "You are in a ...5"));
//
//        locations.get(1).addExit("W", 2);
//        locations.get(1).addExit("E", 3);
//        locations.get(1).addExit("S", 4);
//        locations.get(1).addExit("N", 5);
//
//        locations.get(2).addExit("N", 5);
//
//        locations.get(3).addExit("W", 1);
//
//        locations.get(4).addExit("N", 1);
//        locations.get(4).addExit("W", 2);
//
//        locations.get(5).addExit("S", 1);
//        locations.get(5).addExit("W", 2);
//
//        Scanner scanner = new Scanner(System.in);
//
//        int loc = 1;
//        while (true) {
//            System.out.println("location ->" + loc);
//            System.out.println(locations.get(loc).getDescription());
//            if (loc == 0) {
//                break;
//            }
//            Map<String, Integer> exits = locations.get(loc).getExits();
//            System.out.println("available exits are:");
//            for (String exit : exits.keySet()) {
//                System.out.print(exit + ", ");
//            }
//            System.out.println();
//            String direcation = scanner.nextLine().toUpperCase();
//
//            if (direcation.length() > 1) {
//                String[] dividedInput = direcation.split(" ");
//                for (String currentWord : dividedInput) {
//                    if (vocabulary.containsKey(currentWord)) {
//                        direcation = vocabulary.get(currentWord);
//                        break;
//                    }
//                }
//            }
//
//            if (exits.containsKey(direcation)) {
//                loc = exits.get(direcation);
//            } else {
//                System.out.println("ypu cant go in that direction");
//            }
//
//
//        }

    }
}
