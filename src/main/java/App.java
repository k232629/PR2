package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String [] args){
        System.out.println("dsvv");
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Seller seller = (Seller)context.getBean("ivanov");
        seller.sellGoods();



    }
}
