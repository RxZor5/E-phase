import java.util.Scanner;
public class Addieren {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        addieren(a,b);
    }

    public static void addieren(int a, int b){
        System.out.println(a + b);
    }


}
