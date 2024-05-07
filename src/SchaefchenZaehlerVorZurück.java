import java.util.Scanner;

public class SchaefchenZaehlerVorZurück {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variablen deklarieren
        int AnzahlSchaefchen, StartSchaefchen, zaehler = 0;

        //Eingabe
        System.out.println("Gebe die Anzahl der Schaefchen an: ");
        AnzahlSchaefchen = sc.nextInt();
        System.out.println("Gebe den start an: ");
        StartSchaefchen = sc.nextInt();

        //Verarbeitung
        if(StartSchaefchen == 1){
            zaehler = 1;
            while(zaehler <= AnzahlSchaefchen){
                System.out.println("Schäfchen Nummer " + zaehler + " springt über den Zaun");
                zaehler ++;
            }
            System.out.println("Alle Schäfchen sind über den Zaun");

        }else if(StartSchaefchen == AnzahlSchaefchen){
            zaehler = AnzahlSchaefchen;
            while(zaehler > 0){
                System.out.println("Schäfchen Nummer " + zaehler + " Springt über den Zaun");
                zaehler --;
            }
            System.out.println("Alle Schäfchen sind über den Zaun");
        }else{
            System.out.print("Es kann nur das erste oder das letzte Schäfchen beginnen");
        }
    }
}
