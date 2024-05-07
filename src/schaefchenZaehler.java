public class schaefchenZaehler {

    public static void main(String[] args) {
        int zaehler = 1;
        while (zaehler <= 100) {
            System.out.println("Schaefchen Nummer " + zaehler + " springt über den Zaun");

            zaehler = zaehler + 1;

        } // end of while
    while(zaehler >= 0){
        zaehler = zaehler -1;
        System.out.println("Schaefchen Nummer "+ zaehler + " Springt zurück");
        zaehler = zaehler -1;
    }
    } // end of main
} // end of class SchaefchenZaehler