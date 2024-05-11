import java.util.Scanner;

public class Rechtecke {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Höhe des Rechtecks: ");
        int hoehe = sc.nextInt();
        System.out.println("Länge des Rechtecks: ");
        int laenge = sc.nextInt();


            zeichneRechteck(laenge, hoehe);


    }

    public static void zeichneRechteck(int laenge, int hoehe){

        for (int i = 0; i <= hoehe; i++) {
            System.out.print(" * ");

            for (int j = 0; j <= laenge; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }



    }



}

