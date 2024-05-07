
import java.util.Scanner;

public class Schreibtichtest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        // Variablen deklarieren
        int y;
        int x;
        int total = 0;

        System.out.print("Bitte n eingeben: ");
        int n = sc.nextInt();

        for(x = 1 ; x <= n; x++){
            y = x * x;
            System.out.println(y);
            total = total + y;

        }
        System.out.println("Total ist: " + total);
    }
}
