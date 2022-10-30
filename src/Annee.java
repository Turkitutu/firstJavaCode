import java.util.Scanner;

public class Annee {

    public boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        int monAnnee;
        do {
            System.out.print("Donner une année (> 0): ");
            monAnnee = saisie.nextInt();

        } while(monAnnee <= 0);

        Annee obj = new Annee();
        if(obj.estBissextile(monAnnee)) {
            System.out.println(monAnnee + " est une année bissextile");
        }
        else {
            System.out.println(monAnnee + " n'est pas une année bissextile");
        }
    }
}