package Pizzas;

public class Client {
    public static void main(String[] args){
        Pizza pizza1=new Jambon(new Thon(new Thon(new Champignons(new PizzaClassique()))));
        System.out.println(pizza1.afficheDescription()+" "+pizza1.calculePrix());
    }
}
