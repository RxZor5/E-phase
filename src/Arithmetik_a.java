public class Arithmetik_a {
    public static void main(String[] args){


        for (int i = 1000; i < 9999; i++) {

            int d = i%10; //Einer
            int c = (i %100 - d)/10; //Zehner
            int b = (i %1000 - i % 100)/100; //Hunderter
            int a = (i %10000 - i%1000)/1000; //Tausender

            if(Math.pow(a, b) * Math.pow(c,d) == i){
                System.out.println(i);
            }
        }

    }
}
