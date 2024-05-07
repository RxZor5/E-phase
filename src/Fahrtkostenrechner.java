import java.text.NumberFormat;
import java.util.Scanner;

public class Fahrtkostenrechner {
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklarieren
        double gefahreneKm, verbrauch, preisProLiter = 1.34, Ergebnis;


        //Eingabe
        System.out.print("Zurückgelegte Kilometer: ");
        gefahreneKm = sc.nextDouble();
        System.out.print("Verbracuh auf 100km: ");
        verbrauch = sc.nextDouble();

        //Verabreitung / Berechnung
        Ergebnis = gefahreneKm * verbrauch/100 * preisProLiter;

        //Ausgabe
        System.out.print("\n Der Gesamt Preis für die Fahre Beträgt: " + n.format(Ergebnis) + "€");

    }
}
