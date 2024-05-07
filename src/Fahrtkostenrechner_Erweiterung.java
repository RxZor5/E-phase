import java.text.NumberFormat;
import java.util.Scanner;

public class Fahrtkostenrechner_Erweiterung {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklarieren
        double gefahreneKm,
                verbrauch,
                preisProLiter = 1.34,
                ErgebnisEuro,
                ErgebnisDollar,
                ErgebnisYen,
                ErgebnisLira;
        int Waehrung;


        //Eingabe
        System.out.print("Zurückgelegte Kilometer: ");
        gefahreneKm = sc.nextDouble();
        System.out.print("Verbrauch auf 100km: ");
        verbrauch = sc.nextDouble();
        System.out.print("Wählen Sie ihre Währung: \n" +
                "1 = Euro:  \n" +
                "2 = US-Dollar:  \n" +
                "3 = Yen:  \n" +
                "4 = Lira: \n" +
                "Angabe: ");
        Waehrung = sc.nextInt();

        //Verabreitung / Berechnung

        ErgebnisEuro = gefahreneKm * verbrauch/100 * preisProLiter;

        ErgebnisDollar = gefahreneKm * verbrauch / 100 * preisProLiter * 1.09;

        ErgebnisYen = gefahreneKm * verbrauch / 100 * preisProLiter * 1.09 * 163.07;

        ErgebnisLira = gefahreneKm * verbrauch / 100 * preisProLiter * 1.09 * 33.66;




        //Ausgabe

        if(Waehrung == 1){
            System.out.print("\n Der Gesamt Preis für die Fahrt Beträgt: " + n.format(ErgebnisEuro) + "€");
        }else if(Waehrung == 2){
            System.out.print("\n Der Gesamt Preis für die Fahrt Beträgt: " + n.format(ErgebnisDollar) + "$");
        }else if(Waehrung == 3){
            System.out.print("\n Der Gesamt Preis für die Fahrt Beträgt: " + n.format(ErgebnisYen) + "¥");
        }else if(Waehrung == 4){
            System.out.print("\n Der Gesamt Preis für die Fahrt Beträgt: " + n.format(ErgebnisLira) + "₺");
        }
    }
}
