import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        if (args.length >= 3) {
            System.out.println("Le premier argument est " + args[0]);
            System.out.println("Le deuxi`eme argument est " + args[1]);
            System.out.println("Le troisi`eme argument est " + args[2]);
        }else{
            System.out.println("There no args!!");
        }
    }
}