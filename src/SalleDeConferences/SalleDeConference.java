package SalleDeConferences;

public class SalleDeConference {
    Ordinateur ordinateur;
    Salle salle;
    SystemeAudio systemeAudio;
    VideoProjecteur videoProjecteur;

    public SalleDeConference(Ordinateur ordinateur, Salle salle,
                             SystemeAudio systemeAudio, VideoProjecteur videoProjecteur)
    {
        this.ordinateur=ordinateur;
        this.salle=salle;
        this.systemeAudio=systemeAudio;
        this.videoProjecteur=videoProjecteur;
    }

    public void allumer(){
        salle.allumeLumiere();
        ordinateur.allume();
        videoProjecteur.allume();
        videoProjecteur.setModePleinEcran();
        systemeAudio.allume();
        systemeAudio.setVolumeSon(10);
    }

    public void eteindre(){
        systemeAudio.eteint();
        videoProjecteur.eteint();
        ordinateur.eteint();
        salle.eteintLumiere();
    }

}
