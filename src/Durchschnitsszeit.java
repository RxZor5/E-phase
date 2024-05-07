import java.text.NumberFormat;
import java.util.Scanner;

public class Durchschnitsszeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklarieren
        int AnzahlZeiten;
        double AktuelleZeit, Gesamtzeit = 0, Durchschnittszeit;

        //Eingabe
        System.out.println("Geben Sie die Anzahl der Zeiten an: ");
        AnzahlZeiten = sc.nextInt();

        if(AnzahlZeiten > 0){
            for (int i = 1; i <= AnzahlZeiten ; i++) {
                System.out.println("Geben Sie eine Zeit ein: ");
                AktuelleZeit = sc.nextDouble();
                Gesamtzeit = Gesamtzeit + AktuelleZeit;
            }
        }else{
            System.out.println("Ungültige Angabe");
        }

        //Verarbeitung

        Durchschnittszeit = Gesamtzeit /AnzahlZeiten;

        //Ausgabe
        System.out.println("Durchschnittszeit: " + n.format(Durchschnittszeit));


    }
}
