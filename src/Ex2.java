import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner saisie = new Scanner(System.in);
        int a, b, c;
        System.out.print("Donner 3 entiers: ");
        a = saisie.nextInt();
        b = saisie.nextInt();
        c = saisie.nextInt();
        Ex2 obj = new Ex2(); //Créeation d'une instance de la classe Ex2
        System.out.println(a + "+" + b + "+" + c + "=" + obj.addition(a, b, c));
        System.out.println("Le maximum des 3 entiers est " + obj.max(a, b, c));
        if(obj.premier(a)) {
            System.out.println(a + " est un nombre premier");
        }
        else {
            System.out.println(a + " n'est pas un nombre premier");
        }
    }

    public int addition(int x, int y, int z){
        return x+y+z;
    }

    public int max(int x, int y, int z){
        if (x > y && x > z)
            return x;
        else if (z > x && z > y)
            return z;
        else
            return y;
    }

    public boolean premier(int x){
        int i;
        if(x < 2)
            return false;

        for(i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0)
                return false;
        }
        return true;
    }
}
