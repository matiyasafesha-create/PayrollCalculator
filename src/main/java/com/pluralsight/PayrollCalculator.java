package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        try{


        FileReader filereader = new FileReader("src/main/resources/DataFiles/mary_had_a_little_lamb.txt");
        BufferedReader bufReader = new BufferedReader(filereader);

        String input;

        while ((input = bufReader.readLine()) != null) {
            System.out.println(input);
        }

        bufReader.close();

    }catch (IOException e){
        e.printStackTrace();




    }
}}
