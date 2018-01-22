public class Joueur {

String nom;
String choix="";

public void setnom(String nom){ this.nom=nom;}
    public String getNom() {return this.nom;}

public void setChoix(int choix){this.choix+=(choix+", ");}
    public String getChoix(){return this.choix;}
}

