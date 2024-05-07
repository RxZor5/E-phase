import java.text.NumberFormat;
import java.util.Scanner;

public class BMI_4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Variablen
        double gewicht, groesse, BMI;
        int entscheidung;

        //Eingabe
        System.out.println("Geben Sie das Gewicht an: ");
        gewicht = sc.nextDouble();

        System.out.println("Geben Sie die Größe in meter an: ");
        groesse = sc.nextDouble();

        // Verarbeitung
        BMI = gewicht/(groesse*groesse);

        if(BMI < 18.5){
            System.out.println("Untergewicht, BMI: " + n.format(BMI));
        }else if(BMI > 25){
            System.out.println("Übergewicht, BMI: " + n.format(BMI));
        }else{
            System.out.println("Normalgewicht, BMI: " + n.format(BMI));
        }

        System.out.println("Wollen sie noch einen BMI berechnen? 1 = Ja 2 = nein");
        entscheidung = sc.nextInt();

        if(entscheidung == 1){
            main(null);
        }else if(entscheidung == 2){
            System.out.println("Bis zum nächsten mal!");
        }else {
            System.out.println("Geben Sie eine gültige entschidung an");
        }
    }
}
