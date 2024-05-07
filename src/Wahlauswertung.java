import java.text.NumberFormat;
import java.util.Scanner;

public class Wahlauswertung {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        NumberFormat n = NumberFormat.getNumberInstance();
        n.setMaximumFractionDigits(2);

        //Definition von Variablen
        int StimmenMathe, StimmenEnglisch, StimmenDeutsch;
        double Summe, AnteilMathe, AnteilEnglisch, AnteilDeutsch;

        //Eingabe
        System.out.println("Stimmen Mathe:");
        StimmenMathe = sc.nextInt();
        System.out.println("Stimmen Englisch:");
        StimmenEnglisch = sc.nextInt();
        System.out.println("Stimmen Deutsch:");
        StimmenDeutsch = sc.nextInt();

        //Verarbeitung
        Summe = StimmenMathe + StimmenEnglisch + StimmenDeutsch;
        AnteilMathe = StimmenMathe / Summe * 100;
        AnteilEnglisch = StimmenEnglisch / Summe * 100;
        AnteilDeutsch = StimmenDeutsch / Summe * 100;

        System.out.println("Anteil Mathe: "+ n.format(AnteilMathe) + "%");
        System.out.println("Anteil Englisch: "+ n.format(AnteilEnglisch) + "%");
        System.out.println("Anteil Deutsch: "+ n.format(AnteilDeutsch) + "%");


    }

}
