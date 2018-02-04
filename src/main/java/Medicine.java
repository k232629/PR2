package main.java;

public class Medicine implements Goods {
    private double medPrice = 20.00;
    public double price;

    public Medicine(int number){
        price=medPrice*number;

    }

    public void getPrice() {
        System.out.println("The price for medicine is "+ price);
    }
}
