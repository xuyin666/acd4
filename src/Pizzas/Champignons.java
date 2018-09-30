package Pizzas;

public class Champignons extends Decorateur {
    public Champignons(Pizza pizza){
        super(pizza);
        this.cout=0.8;
        this.descrption="Champignon";
    }
}
