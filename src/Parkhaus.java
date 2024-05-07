import java.text.NumberFormat;
import java.util.Scanner;

public class Parkhaus {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen deklaieren:
        int angefangeneStunden;
        double Preis, Startgebuehr = 2.50;

        //Eingabe
        System.out.print("Angefangene Stunden angeben: ");
        angefangeneStunden = sc.nextInt();

        //Verarbeitung
        if(angefangeneStunden < 2 ){
            System.out.print("Die Parkgebühr beträgt: " + Startgebuehr + "€");
        }else if(angefangeneStunden >= 8){

            System.out.print("Die Parkgebühr beträgt: 10€");
        }else{
            Preis = Startgebuehr + angefangeneStunden;
            System.out.print("Die Parkgebühr beträgt: " + Preis + "€");
        }
    }
}
