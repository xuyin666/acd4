package Pizzas;

public class Fromage extends Decorateur {
    public Fromage(Pizza pizza){
        super(pizza);
        this.cout=0.6;
        this.descrption="Fromage";
    }
}
