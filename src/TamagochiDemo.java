import java.sql.SQLOutput;

public class TamagochiDemo {
    public static void main(String[] args) {
        Tamagochi Baby = new Tamagochi();

        Baby.x=6;
        Baby.y=4;
        Baby.food=5;

        Baby.move("unten", 4);
        System.out.println(Baby.y);
        Baby.getFood(5);
        System.out.println(Baby.food);
        Baby.move("links", 6);
        System.out.println(Baby.x);
    }
}
