package main.java;

public class Books implements Goods {

    private double booksPrice = 20.00;
    public double price;

    public Books(int number){
        price=booksPrice*number;

    }

    public void getPrice() {
        System.out.println("The price for books is "+ price);
    }
}
