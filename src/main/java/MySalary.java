package main.java;

public class MySalary implements Salary {

    private double average = 3500.0;
    public double salary;

    public MySalary (int rank){
        salary = average * rank;

    }

    public void getSalary(){
        System.out.println("The salary is " +salary);
    }
}
