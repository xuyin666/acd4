package Pizzas;

public class Olives extends Decorateur {
    public Olives(Pizza pizza){
        super(pizza);
        this.cout=0.9;
        this.descrption="Olives noire";
    }
}
