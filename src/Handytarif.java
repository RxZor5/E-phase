import java.text.NumberFormat;
import java.util.Scanner;

public class Handytarif {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklarieren
        double minutenTelefoniert, preis, Telefonpreis, SMSpreis;
        int gesendeteSMS, monatspreis = 5;

        //Eingabe

        System.out.print("Geben sie die Anzahl der telefonierten Minuten an: ");
        minutenTelefoniert = sc.nextDouble();
        System.out.print("Geben sie die Anzahl der gesendeten SMS an: ");
        gesendeteSMS = sc.nextInt();

        //Verarbeitung

        Telefonpreis = (minutenTelefoniert - 20) * 0.19;
        SMSpreis = (gesendeteSMS - 50) * 0.09;

        if(gesendeteSMS < 50 && minutenTelefoniert < 20){
            preis = monatspreis;
        }else{
            preis = monatspreis + Telefonpreis + SMSpreis;
        }

        //Ausgabe
        System.out.print("Monatspreis: " + monatspreis +"€ \n" +
                "SMS gesendet: " + gesendeteSMS + " Stück -> "+ n.format(SMSpreis) + "€ \n" +
                "Minuten Telefoniert: " + minutenTelefoniert + " Minuten -> " + n.format(Telefonpreis) + "€ \n" +
                "Gesamtpreis: " + n.format(preis) + "€");
    }
}
