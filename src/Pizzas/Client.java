package Pizzas;

public class Client {
    public static void main(String[] args){
        Pizza pizza1=new Thon(new Champignons(new PizzaClassique()));
        pizza1.afficheDescription();
    }
}
