import java.util.Scanner;
public class gruss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        begruessePerson(name);
    }

    public static void begruessePerson(String name){

        System.out.println("Hallo " + name);
    }
}
