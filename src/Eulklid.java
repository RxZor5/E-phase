import java.text.NumberFormat;
import java.util.Scanner;

public class Eulklid {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);


    //Variablen
        int a,b ;
        int result, result_kgV, result_kgV_1;

    //Eingabe
        System.out.println("gebe die erste Zahl an");
        a = sc.nextInt();
        System.out.println("Gebe die zweite zahl an");
        b= sc.nextInt();

    //Verarbeitung

        result_kgV_1 = a*b;

        while(a!=b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }

        result = a;

        result_kgV = result_kgV_1 / result;



    //Ausgabe
        System.out.println("ggT: " + result);
        System.out.println("kgV: " + result_kgV);

    }
}

