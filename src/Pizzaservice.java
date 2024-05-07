import java.text.NumberFormat;
import java.util.Scanner;
public class Pizzaservice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);
// Definition Variablen
        int AnzahlPizzen;
        double PreisPizza = 5.90;
        double GesamtPreis, GesamtPreisMitRabatt, GesamtPreisMitRabattLieferung, GesamtPreisMitLieferung;
        int Lieferung;
// Eingabe
        System.out.print("Anzahl bestellter Pizzen: ");
        AnzahlPizzen = sc.nextInt();
        System.out.println();

        System.out.print("Lieferung ? 1 = ja 0 = nein: ");
        Lieferung = sc.nextInt();
        System.out.println();

// Verarbeitung
        GesamtPreis = PreisPizza * AnzahlPizzen;
        GesamtPreisMitRabatt = GesamtPreis - GesamtPreis * 0.10;
        GesamtPreisMitLieferung = PreisPizza * AnzahlPizzen + 2;
        GesamtPreisMitRabattLieferung = GesamtPreis - GesamtPreis * 0.10 + 2;
// Ausgabe
       if(AnzahlPizzen > 3 && Lieferung == 1){
           System.out.print("Der Gesamtpreis beträgt: " + n.format(GesamtPreisMitRabattLieferung) + "€");
       }else if(AnzahlPizzen > 3 && Lieferung == 0){
           System.out.print("Der Gesamtpreis beträgt: " + n.format(GesamtPreisMitRabatt) + "€");
       }else if(AnzahlPizzen < 3 && Lieferung == 1){
           System.out.print("Der Gesamtpreis beträgt: " + n.format(GesamtPreisMitLieferung) + "€");
       }else if(AnzahlPizzen < 3 && Lieferung == 0){
           System.out.print("Der Gesamtpreis beträgt: " + n.format(GesamtPreis) + "€");
       }

    } // end of main
} // end of class Pizzaservice