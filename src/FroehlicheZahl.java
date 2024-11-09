import java.util.HashSet;
import java.util.Scanner;

public class FroehlicheZahl {
    // Methode zur Berechnung der Summe der Quadrate der Ziffern einer Zahl
    public static int summeDerQuadrateDerZiffern(int n) {
        HashSet<Integer> Summen = new HashSet<Integer>();

        int Zahl = n;
        while (Zahl > 1) {
            int summe = 0;
            while (Zahl > 0) {
                int ziffer = Zahl % 10;
                summe += ziffer * ziffer;
                Zahl /= 10;
            }
            Zahl = summe;
            if (Summen.contains(Zahl)) {
                return 0; // Nicht fröhlich
            }
            Summen.add(Zahl);
        }
        return Zahl;
    }

    // Methode zur Überprüfung, ob eine Zahl eine fröhliche Zahl ist
    public static boolean istFroehlicheZahl(int n) {
        return summeDerQuadrateDerZiffern(n) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung für den Benutzer
        System.out.print("Geben Sie eine Zahl ein, um zu testen, ob sie eine fröhliche Zahl ist: ");
        int zahl = scanner.nextInt();

        // Überprüfung, ob die Zahl eine fröhliche Zahl ist
        if (istFroehlicheZahl(zahl)) {
            System.out.println("Die Zahl " + zahl + " ist eine fröhliche Zahl.");
        } else {
            System.out.println("Die Zahl " + zahl + " ist keine fröhliche Zahl.");
        }
    }
}
