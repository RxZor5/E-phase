import java.text.NumberFormat;
import java.util.Scanner;
public class Maklerfirma {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);
        //Deklaration Variablen
        double meterlaengeBreit, meterlaengeLang, Quadratmeterpreis, Grundstueckpreis, Ergebnis, ErgebnisOhneSteuer, ErgebnisOhneGrundstueck;

        //Eingabe
        System.out.print("Grundstückpreis angeben");
        Grundstueckpreis = sc.nextDouble();
        System.out.print("Länge der Breite in Meter");
        meterlaengeBreit = sc.nextDouble();
        System.out.print("Länge der Langen Seite in Meter");
        meterlaengeLang = sc.nextDouble();
        System.out.print("Quadratmeter preis angeben");
        Quadratmeterpreis = sc.nextDouble();

        //Verarbeitung
        ErgebnisOhneGrundstueck =  meterlaengeBreit * meterlaengeLang * Quadratmeterpreis;
        ErgebnisOhneSteuer = meterlaengeBreit * meterlaengeLang * Quadratmeterpreis + Grundstueckpreis;
        Ergebnis = ErgebnisOhneSteuer + ErgebnisOhneSteuer * 0.03 + ErgebnisOhneSteuer * 0.19;

        //Ausgabe
        System.out.print(
                "  Grundstückpreis:" + n.format(Grundstueckpreis) + "€ \n"+
                "+ Quadratmeterpreis:" + n.format(ErgebnisOhneGrundstueck) + "€ \n" +
                "Gesamt Preis ohne Steuern: " + n.format(ErgebnisOhneSteuer) + "€ \n" +
                "Gesamtpreis: " + n.format(Ergebnis) + "€"
        );


    }
}
