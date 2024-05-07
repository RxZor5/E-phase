import java.text.NumberFormat;
import java.util.Scanner;

public class PQFormel {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklarieren
        double x1, x2, p, q;

        //Eingabe

        System.out.print("Geben sie den ersten Wert (p) an: ");
        p = sc.nextDouble();
        System.out.print("Geben sie den zweiten Wert (q) an: ");
        q = sc.nextDouble();

        //Verarbeitung

        x1 = -p/2 + Math.sqrt(Math.pow(p/2, 2) -q);
        x2 = -p/2 - Math.sqrt(Math.pow(p/2, 2) -q);

        //Ausgabe
        System.out.print("x1 entsrpicht: " + x1 + "\n");
        System.out.print("x2 entspricht: " + x2);

    }
}
