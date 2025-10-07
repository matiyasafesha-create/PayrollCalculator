package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator1 {
    public static void main(String[] args) {

        try{
        FileReader fileReader1 = new FileReader("src/main/resources/DataFiles/employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader1);

        String input;

        while ((input = bufReader.readLine()) != null){

          String [] employeeinput = input.split("\\|");
          System.out.println(employeeinput[0]);










        }






        bufReader.close();

    }catch (IOException e ) {
            e.printStackTrace();

        }

    }















}
