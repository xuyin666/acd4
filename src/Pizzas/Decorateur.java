package Pizzas;

public abstract class Decorateur extends Pizza {
    Pizza pizza;

    public Decorateur(Pizza pizza){
        this.pizza=pizza;
    }

    public String afficheDescription(){
        return pizza.afficheDescription()+descrption+calculePrix();
    }

    public double calculePrix(){
        return pizza.calculePrix()+cout;
    }
}
