public class DemoSand {
    public static void main(String[] args) {

        double l = 1.4;
        double w = 1.4;
        double h = 0.2;
        String name = "Homemade Sandpit";
        double price = 0;

        System.out.println("Für " + name + " wir benötigen " + calcVolume(l, w, h) + "m3 Sand.Kosten : " + price + " Euro" );

        double lBauhaus = 1.5;
        double wBauhaus = 1.5;
        double hBauhaus = 0.26;
        String nameBauhaus = "Sandpit from Bauhaus";
        double priceBauhaus = 59;

        int x = 7;
        Sandpit homemade = new Sandpit();
        Sandpit bauhaus= new Sandpit();
        Sandpit obi = new Sandpit();

        homemade.width = 1.4;
        homemade.length = 1.4;
        homemade.height = 0.2;
        homemade.name = "Selbstgemacht";
        homemade.price = 0.0;
        System.out.println(homemade.name + " = " + homemade.calcVolume());

        bauhaus.width = 1.55;
        bauhaus.length  = 1.55;
        bauhaus.height = 0.26;
        bauhaus.name = "Bauhaus Sandpit";
        bauhaus.price = 59;
        bauhaus.print();

        obi.length = 1.6;
        obi.width = 1.6;
        obi.height = 0.30;
        obi.name = "Obi Sandpit";
        obi.price = 89;


        System.out.println("Für " + nameBauhaus + " wir benötigen " + calcVolume(lBauhaus, wBauhaus, hBauhaus) + " m3 Sand.Kosten : " + priceBauhaus + " Euro");
    }

    public static double calcVolume(double length, double width, double height){
       return length * width * height;
    }
}
