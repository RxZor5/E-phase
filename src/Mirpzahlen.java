public class Mirpzahlen {

    public static void main(String[] args){
        for (int i = 1; i <=100; i++) {

            boolean test = istPrim(i);
            System.out.println(test);
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
        int result = 0;
        for (int j = Zahl; j > 0; j /= 10) {
            result = result * 10 + j % 10;
        }
        return result;
    }

    public static boolean istMirpZahl(int Zahl){
        boolean mirpZahl = true;

        if(){

        }

        return mirpZahl;
    }
}
