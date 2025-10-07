package com.pluralsight;

public class Employee {

    private int Id;
    private String name;
    private double hoursworked;
    private double payrate;

    Employee (int id , String name , double hoursworked , double payrate){
        this.Id = id;
        this.name = name;
        this.hoursworked = hoursworked;
        this.payrate =payrate;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

    public double getPayrate() {
        return payrate;
    }

    public void setPayrate(double payrate) {
        this.payrate = payrate;
    }

    public int getId() {
        return Id;

    }

    public void setId(int id) {
        Id = id;
    }

    public  double getgrosspay(){
        return hoursworked * payrate;
    }





}

