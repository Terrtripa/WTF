public class Square {
    double length;
    double width;


    public double calcArea(){
        return length * width;
    }
    public double calcDiagonal(){
        return Math.sqrt(length * length + width * width);
    }



}
