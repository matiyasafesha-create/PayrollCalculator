package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator1 {
    public static void main(String[] args) {



        try{

            Scanner scanner = new Scanner(System.in);




        FileReader fileReader1 = new FileReader("src/main/resources/DataFiles/employees.csv");
        BufferedReader bufReader = new BufferedReader(fileReader1);

        FileWriter fileWriter = new FileWriter("src/main/resources/DataFiles/newemployeesreporttest1.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



        bufReader.readLine(); // reades and ignore the line from the data we are storing

        String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;


            while ((input = bufReader.readLine()) != null){

          String [] employeeinput = input.split("\\|");
          ///if (! employeeinput.equals(employeeinput));

        int employeeid = Integer.parseInt(employeeinput[0]);
        String name = employeeinput[1];
        double hoursworked = Double.parseDouble(employeeinput[2]);
        double payrate = Double.parseDouble(employeeinput[3]);


                employeeList[count] = new Employee(employeeid, name, hoursworked, payrate);

                System.out.printf("EmployeeID: %d\nEmployeeNAme: %s\nGrossPay: $%.2f\n\n", employeeList[count].getId(),
                        employeeList[count].getName(),employeeList[count].getgrosspay());

                count++;



                System.out.println("Enter the name of the file employee file to process:?");
                String fileemployeename = scanner.nextLine();
                bufReader.read();


                System.out.println("Enter the name of the payroll file to create:?");
                String filepayrollname = scanner.nextLine();











                for (int i = 1 ; i < count; i ++){
                    bufferedWriter.write(employeeList[i].getId() + "," +
                            employeeList[i].getName() + "," +
                            String.format("$%.2f", employeeList[i].getgrosspay()));
                    bufferedWriter.newLine();


                }






            }

            bufferedWriter.close();
            bufReader.close();

        }catch (IOException e ) {
            e.printStackTrace();

        }



















    }





















}
