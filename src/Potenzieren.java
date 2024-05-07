import java.util.Scanner;
public class Potenzieren {

    public static int schnellesPotenzieren(int basis, int exponent){
        int pot = 1;

        while(exponent > 0){

            if(exponent % 2 == 1){
                pot = pot*basis;
                exponent = exponent -1;
            }else{
                basis = basis*basis;
                exponent = exponent/2;
            }// end of if

        } //end of while

        return pot;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Basis: ");
        int basis = sc.nextInt();
        System.out.println("Exponent: ");
        int exponent = sc.nextInt();

        int pot = schnellesPotenzieren(basis, exponent);
        System.out.println("Die Potenz ergibt " + pot);

    }
}

