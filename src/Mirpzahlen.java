public class Mirpzahlen {

    public static void main(String[] args){
        for (int i = 1; i <=999; i++) {

            boolean test = istMirpZahl(i);
            System.out.print(test + " = ");
            System.out.print(i);
            System.out.println();



        }
    }

    public static boolean istPrim(int Zahl){

        boolean primZahl=true;  //... solange wir keinen Teiler gefunden haben
        int moeglicherTeiler = 2;

        while(moeglicherTeiler  < Zahl){ //Teiler muss kleiner sein als Zahl selbst
            if(Zahl % moeglicherTeiler==0) { //Teiler gefunden -> keine Primzahl
                primZahl=false;
            }
            moeglicherTeiler = moeglicherTeiler + 1;  //Teiler hochzählen
        }
        return primZahl;

    }

    public static int umdrehen (int Zahl){

        int reverse = 0;
        do{
            reverse= reverse*10+(Zahl%10); //erst einer, dann zehner, dann hunderter
            Zahl /= 10;
        } while  (Zahl > 0);

        return reverse;

    }

    public static boolean istMirpZahl(int Zahl){
        boolean mirpZahl;
        if (istPrim(Zahl)) {
            int umgedreht = umdrehen(Zahl);
            if (istPrim(umgedreht)) {
                mirpZahl = true;
            } else {
                mirpZahl = false;
            }
        } else {
            mirpZahl = false;
        }



        return mirpZahl;
    }
}
