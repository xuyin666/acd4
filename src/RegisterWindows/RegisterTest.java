package RegisterWindows;

public class RegisterTest {
    public static void main(String[] args){
        RegisterWindows instance = RegisterWindows.getInstance();
        String nom=instance.getNom();
        System.out.println(nom);

        instance.setNom("******");

        RegisterWindows instance1= RegisterWindows.getInstance();
        String nom1=instance1.getNom();
        System.out.println(nom1);

        RegisterWindows instance2= RegisterWindows.getInstance();
        String nom2=instance2.getNom();
        System.out.println(nom2);

    }
}
