import java.util.Scanner;

public class Rechtecke {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Höhe des Rechtecks: ");
        int hoehe = sc.nextInt();
        System.out.println("Länge des Rechtecks: ");
        int laenge = sc.nextInt();

    }

    public static int zeichneRechteck(int laenge, int hoehe){
        for (int i = 1; i <= hoehe; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
