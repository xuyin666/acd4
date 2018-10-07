package exe1;

public class FabriqueJonction implements FabriqueVehicule{
    private FabriqueVehicule f1;
    private FabriqueVehicule f2;
    private boolean b=false;

    public FabriqueJonction(FabriqueVehicule f1, FabriqueVehicule f2){
        this.f1=f1;
        this.f2=f2;
    }

    public Vehicule creerVehicule(){
        if(b){
            b=false;
            return f1.creerVehicule();
        }
        b=true;
        return f2.creerVehicule();
    }

}
