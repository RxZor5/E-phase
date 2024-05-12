import java.text.NumberFormat;
import java.util.Scanner;

public class GueteVonZufallszahlen {


    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(0);

        System.out.println("Anzahl der Blöcke: ");
        double anzahl = sc.nextInt();

        double altezufallsZahl = Math.floor(Math.random()*1000);
        double result = hp(altezufallsZahl, anzahl) / 100;
        System.out.println(result);



    }

    public static double hp(double altezufallsZahl, double anzahl){
            int checkedBlocks = 0;
            double result = 0;
            while(checkedBlocks < anzahl){

                if (altezufallsZahl == 0) {
                    return Math.random();
                }

                    double z = altezufallsZahl;
                    double d = z % 10; //Einer
                    double c = (z % 100 - d) / 10; //Zehner
                    double b = (z % 1000 - z % 100) / 100; //Hunderter

                    if(d < c && b < c){

                        z = (int) (z * Math.PI);
                        z *= z;
                        z *= z;
                        z *= z;
                        z = z - (int) z;
                        result += z;
                    }
                checkedBlocks++;
                }
            return result;
    }
}


