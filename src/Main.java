import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean continuer = true;
        Joueur j1=new Joueur();
        Joueur j2=new Joueur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le nom du joueur 1?");

        String j1nom=sc.nextLine();
        j1.setnom(j1nom);

        System.out.println("Quel est le nom du joueur 2?");

        String j2nom=sc.nextLine();
        j2.setnom(j2nom);

        while(continuer==true){
            int allumettes = (int)(Math.round (Math.random() * (100-20+1)+20));
            while (allumettes>0){

             System.out.println("Nombre d'allumettes restantes: "+allumettes);
             System.out.println("C'est votre tour,"+j1.getNom());
             int choix= sc.nextInt();
                if(choix>3)
                    choix=3;
                if(choix<=0)
                    choix=1;
             allumettes=allumettes-choix;
             j1.setChoix(choix);
             if(allumettes<=0)
             {
                 System.out.println("Vous avez perdu la partie!");
             }
             if(allumettes>0) {
                 System.out.println("C'est votre tour," + j2.getNom());
                 System.out.println("Nombre d'allumettes restantes: "+allumettes);
                 choix = sc.nextInt();
                 if(choix>3)
                     choix=3;
                 if(choix<=0)
                     choix=1;
                 allumettes = allumettes - choix;
                 j2.setChoix(choix);
                 if (allumettes <= 0) {
                     System.out.println("Vous avez perdu la partie!");
                 }
             }


            }
            System.out.println("Voici les choix de "+j1.getNom()+" : "+j1.getChoix()+"\n"+"Voici les choix de "+j2.getNom()+" : "+j2.getChoix());
        System.out.println("Voulez-vous faire un autre match? 1-oui 2-non");
            int cont=sc.nextInt();
            if(cont==1){
                continuer=true;
                System.out.println("C'est reparti!");
            }
            else{
                continuer=false;
                System.out.println("Merci d'avoir joué");
            }
        }

    }
}
