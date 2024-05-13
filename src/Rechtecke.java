import java.util.Scanner;

public class Rechtecke {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Höhe des Rechtecks: ");
        int hoehe = sc.nextInt();
        System.out.println("Länge des Rechtecks: ");
        int laenge = sc.nextInt();
        System.out.println("Einrückung: ");
        int einrueckung = sc.nextInt();

            zeichneRechteck(laenge, hoehe, einrueckung);


    }

    public static void zeichneRechteck(int laenge, int hoehe, int einrueckung){
        for (int i = 1; i <= hoehe; i++) {
            if(einrueckung != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < laenge; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        }



}

