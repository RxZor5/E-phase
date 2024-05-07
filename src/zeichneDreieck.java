import java.util.Scanner;
public class zeichneDreieck {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Größe des Dreiecks angeben: ");
        int groesse = sc.nextInt();

        dreieck(groesse);
    }

    public static void dreieck(int groesse){
        for (int i = 1; i <= groesse; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
