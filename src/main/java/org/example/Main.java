package org.example;
import Waiting.Patern;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Patern.getInstant(0);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            list.add(i);
        }

        int k;
        for (int i : list){
            k = i;
            System.out.println(i);
        }





    }
}