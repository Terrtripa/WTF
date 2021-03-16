public class SquareDemo {



    public static void main(String[] args) {


        Square Marianne = new Square();
        Square Günther = new Square();



        Günther.width = 5;
        Günther.length = 5;
        System.out.println("Günther has an area of " + Günther.calcArea() + " m2 and a diagonal of " + Günther.calcDiagonal());

        Marianne.width = 8;
        Marianne.length = 8;
        System.out.println("Marianne has an area of " + Marianne.calcArea() + " m2 and a diagonal of " + Marianne.calcDiagonal());

    }



}
