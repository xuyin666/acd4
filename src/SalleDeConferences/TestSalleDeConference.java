package SalleDeConferences;

public class TestSalleDeConference {
    public static void main(String[] args){
        Ordinateur ordinateur=new Ordinateur();
        Salle salle=new Salle();
        VideoProjecteur videoProjecteur=new VideoProjecteur();
        SystemeAudio systemeAudio=new SystemeAudio();
        SalleDeConference salleDeConference=new SalleDeConference(ordinateur,salle, systemeAudio, videoProjecteur);
        salleDeConference.allumer();
        salleDeConference.eteindre();
    }
}
