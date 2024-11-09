import java.util.Scanner;
import java.util.ArrayList;

public class lieblingsfächer {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Wahlen = new ArrayList<String>();

        int Antwort = 1;

        while(Antwort == 1){
            System.out.println("Geben Sie einer Ihrer lieblingsfächer ein: ");
            String Wahl = sc.next();
            Wahlen.add(Wahl);
            System.out.println("Möchten Sie noch ein weiteres Lieblingsfach eingeben? 1 = ja, 0 = nein");
            Antwort = sc.nextInt();
        }

        System.out.println("Die Liste Ihrer Fächer: ");

        for (int i = 0; i < Wahlen.size(); i++) {
            System.out.println(Wahlen.get(i));
        }


    }

}
