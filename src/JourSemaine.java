import java.util.Scanner;

public class JourSemaine {

    public void afficherJourSemaine(int jour) {
        switch(jour) {
            case 1:
                System.out.println("C'est lundi");
                break;
            case 2:
                System.out.println("C'est mardi");
                break;
            case 3:
                System.out.println("C'est mercredi");
                break;
            case 4:
                System.out.println("C'est jeudi");
                break;
            case 5:
                System.out.println("C'est vendredi");
                break;
            case 6:
                System.out.println("C'est samedi");
                break;
            case 7:
                System.out.println("C'est dimanche");
                //break;
        }
    }

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        int monJour;
        do {
            System.out.print("Donner un jour de la semaine (entre 1 et 7): ");
            monJour = saisie.nextInt();

        } while(monJour < 1 || monJour > 7);

        JourSemaine obj = new JourSemaine();
        obj.afficherJourSemaine(monJour);
    }
}