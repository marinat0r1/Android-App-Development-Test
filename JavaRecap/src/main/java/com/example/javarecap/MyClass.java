package com.example.javarecap;

import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.println("Wassup");
        }

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("jooo");
        stringArrayList.add("test2");
        stringArrayList.add("test3");

        stringArrayList.add(1, "inserted");

        stringArrayList.remove(0);

        //System.out.println(stringArrayList);

        for (String st : stringArrayList){
            System.out.println(st);
        }

        ArrayList legerArrayList = new ArrayList();

        legerArrayList.add("aStringoo");
        legerArrayList.add(34);
        legerArrayList.add('d');
        legerArrayList.add(2.34);

        //System.out.println(legerArrayList);

        for (Object n : legerArrayList){
            System.out.println(n);
        }
    }
}