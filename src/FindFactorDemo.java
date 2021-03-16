public class FindFactorDemo {
    public static void main(String[] args) {



    }

    public static void findFactors(int number){
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0){
                System.out.println(counter );
            }counter ++;
        }
    }
}
