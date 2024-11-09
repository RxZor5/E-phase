import java.text.NumberFormat;
import java.util.Scanner;

public class GueteVonZufallszahlen {


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(0);

        System.out.println("Anzahl der Blöcke: ");
        double anzahl = sc.nextInt();

        double altezufallsZahl = Math.random();
        double result = hp(altezufallsZahl, anzahl);
        System.out.println(result);



    }

    public static double hp(double altezufallsZahl, double anzahl){
    /*        int checkedBlocks = 0;
            double result = 0;
            while(checkedBlocks < anzahl){
*/
                if (altezufallsZahl == 0) {
                    return Math.random();
                }

                    double z = altezufallsZahl;
                    z = z + Math.PI;
                    z *= z;
                    z *= z;
                    z *= z;
                    z = z - (int) z;
                    //result += z;


                return z;
    }
}


