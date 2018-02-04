package main.java;

import java.util.Collection;

public class AllGoodsSeller implements Seller {

    private Collection<Goods> allGoods;

    public void setGoods(Collection<Goods> goods){
        this.allGoods=goods;
    }

    public AllGoodsSeller(){}

    @Override
    public void sellGoods() {
        for (Goods good:allGoods){
            good.getPrice();
        }


    }
}
