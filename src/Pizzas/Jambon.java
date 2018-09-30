package Pizzas;

public class Jambon extends Decorateur {
    public Jambon(Pizza pizza){
        super(pizza);
        this.cout=0.5;
        this.descrption="Jambon";
    }
}
