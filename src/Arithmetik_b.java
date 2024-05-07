public class Arithmetik_b {
    public static void main (String[] args){



        for (int i = 1; i < 9999; i++) {

            int b = i%10; //Einer
            int a = (i %10000 - i%1000)/1000; //Tausender

            if(Math.pow(i, 2) - 1 == a + a*100 + b*10 + b){
                System.out.println(i);
            }

        }
    }
}
