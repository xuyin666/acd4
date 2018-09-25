public class RegisterWindows {

    protected static String nom="I'm Unique";
    private static RegisterWindows instance=null;

    private RegisterWindows(){}

    public static RegisterWindows getInstance(){
        if(instance==null){
            instance=new RegisterWindows();
        }
        return instance;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public String getNom(){
        return this.nom;
    }


}
