import java.util.Scanner;
public class temperatur{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // Deklaration der Variablen
        double GradCelsius, Ergebnis;
        // Eingabe der umzurechnenden Gradzahl in Celsius
        System.out.print("Zahl in Celsius angeben");
        GradCelsius = sc.nextDouble();
                // Verarbeitung mit Umrechnungsformel: Fahrenheit = Celsius*1.8 + 32
                Ergebnis = GradCelsius * 1.8 + 32;
                // Ausgabe in Konsole
                System.out.print(GradCelsius + " sind in Fahrenheit " + Ergebnis);
    }
}