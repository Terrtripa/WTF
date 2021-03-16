public class Loops {
    public static void main(String[] args) {


        int counter = 1;
        while (counter <= 500) {

            if (counter % 3 == 0)
            {
                System.out.println(counter);
            }
            else if ((counter % 5) == 0 )
            {
                System.out.println(counter);
            }
            else if (counter % 7 == 0 )
            {
                System.out.println(counter);
            }
            counter ++;


        }
    }
}
