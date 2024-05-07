import java.util.Scanner;
public class Aegyptisches_multiplizieren {

    public static double aegyptMulti(double x, double y){
        double prod = 0;

        while(y > 0){
            if(y % 2 == 0){
                x = x*2;
                y = y/2;
            }else{
                prod = prod + x;
                y = y-1;
            }//end of if
        }//end of while

        return prod;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("erste Zahl: ");
        double x = sc.nextInt();

        System.out.println("Zweite zahl: ");
        double y = sc.nextInt();

        double prod = aegyptMulti(x, y);

        System.out.println(prod);
    }

}
