package main.java;

public class Dairy implements Goods {

    private double dairyPrice = 20.00;
    public double price;

    public Dairy(int number){
        price=dairyPrice*number;

    }

    public void getPrice() {
        System.out.println("The price for dairy is "+ price);
    }
}
