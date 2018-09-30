package Pizzas;

public abstract class Pizza {

    protected String descrption="";
    protected double cout;

    public String afficheDescription(){
        return descrption;
    }

    public double calculePrix(){
         return cout;
    }
}
