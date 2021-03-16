public class DatatypeExamples {
    public static void main(String[] args) {
        System.out.println("Einige Beispiele zu Datentypen");

        int laenge; //deklaration
        int breite;
        int ergebnis;

        laenge = 5; //initialisierung
        breite = 7;

        ergebnis = laenge * breite; //initialisierung , auf rechte seite : read/read
        System.out.println("Die Fläche lautet : " + ergebnis + "cm3");

        int a, b;
        a = 4;
        b = 5;


        ergebnis = a + b;
        System.out.println("a+b = " + a + "+" + b + "=" + ergebnis);

        ergebnis = a - b;
        System.out.println("a-b = " + a + "-" + b + "=" + ergebnis);

        ergebnis = a * b;
        System.out.println("a*b = " + a + "*" + b + "=" + ergebnis);

        ergebnis = a / b;
        System.out.println("a/b = " + a + "/" + b + "=" + ergebnis);

        ergebnis = a % b;
        System.out.println("a%b = " + a + "%" + b + "=" + ergebnis);
    }
}
