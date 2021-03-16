public class PerfectNumbers {
    public static void main(String[] args) {
    isPerfect(28);
    }
    public static void isPerfect (long number){
        long counter = 1;
        long sum = 0;

        while (counter < number){
            if (number % counter == 0){
                sum = sum + counter;
            }
            counter ++;
        }
        if (sum == number){
            System.out.println(number + " is perfect");
        }
    }
}
