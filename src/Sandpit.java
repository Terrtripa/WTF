public class Sandpit {

double length;
double height;
double width;
String name;
double price;


public double calcVolume(){
    return length * width * height;
}

public void print(){
    System.out.println("Für " + name + " benötigen wir " + calcVolume() + " m3 Sand.Kosten " + price + " Euro");
}
}
