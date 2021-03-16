public class NumberDivisors {

    public static void main(String[] args) {

    isPrime(1234);
    }

    public static boolean isPrime (int number){
        while (number != 0){
            if (number % 1 == 0 && number % number == 0){
                System.out.println("Number" + number + "is a prime number");
            }else System.out.println("Number" + number + "is not a prime number");
        } return false;

    }
}
