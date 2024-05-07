import java.util.Scanner;
public class Parkscheinautomat
{
    public static void main(String[] args)
    {

//        Scanner initialisieren
        Scanner sc = new Scanner(System.in);

        // Variablen deklariere

        double stunden, minuten, kosten, geldbetrag;

        // Eingabe
        System.out.print("Geparkte Dauer in Min. : ");
        minuten = sc.nextDouble();

        // Verarbeitung
        stunden = minuten / 60;
        stunden = Math.ceil(stunden); // Rundet

        if (stunden <= 2 ) {
            kosten = 2.50;
        }
        else if (stunden >= 5 ) {
            kosten = 5.0;
        }
        else {
            kosten = stunden + 0.5 ;
        }

        // Ausgabe
        System.out.println
                (
                        "Die Kosten betragen: " + kosten + "€" +
                                "\nNächster Geldbtrag: "
                );

        geldbetrag = sc.nextDouble();
        kosten = kosten - geldbetrag;

        while(kosten > 0) {
            System.out.println("Rest zu bzahlen: " + kosten + "€");
            System.out.print("Nächster Geldbtrag: ");

            geldbetrag = sc.nextDouble();
            kosten = kosten - geldbetrag;
        }

        if(kosten < 0 ) {
            System.out.println("Rückgeld: " + Math.abs(kosten) + " €");
        }

        System.out.println("Alle Kosten wurden gezahlt");
    }
}
