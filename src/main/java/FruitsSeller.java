package main.java;

public class FruitsSeller implements Seller{

    private int rank = 3; // rank may be 1, 2 or 3
    private String kindOfFruit = "bananas";
    private MySalary salary;
    private AllGoodsSeller myGoods;
    private int vacation;

    public FruitsSeller(){};


    public void setVacation(int days){
        this.vacation=days;

    }

    public int getDays(){
        return vacation;
    }

    public FruitsSeller(int rank,String fruit){
        this.rank=rank;
        this.kindOfFruit = fruit;

    }
     public FruitsSeller(int rank,MySalary salary){
        this.rank=rank;
        this.salary = salary;

     }

    public FruitsSeller(int rank, MySalary salary, AllGoodsSeller whatSells){
        this.rank=rank;
        this.salary = salary;
        this.myGoods=whatSells;

    }


    @Override
    public void sellGoods() {
        System.out.println("FruitSeller with rank  "+ rank +" selling " + kindOfFruit +"."+ "The standart number of rest days is "+ vacation );
        salary.getSalary();
        myGoods.sellGoods();
    }
}
