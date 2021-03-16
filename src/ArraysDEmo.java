import java.util.Arrays;

public class ArraysDEmo {
    public static void main(String[] args) {
        int[] numbers = {87, 12, 5 , 3, 4, 1, 45};
        printArray(numbers);
        int n = 12;
        int m = 29;
        System.out.println("Number " + n + " is contained within the array : " + containsNumber(numbers,n));
        System.out.println("Number " + m + " is contained within the array : " + containsNumber(numbers,m));
        System.out.println("The Sum of the numbers in the array is : = " + calculateSum(numbers));
        System.out.println(Arrays.toString(reverse(numbers)));
    }


    public static int[] reverse(int[] numbers) {
        int[] reverse = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++) {

            int newindex = numbers.length - 1 - i;
            reverse [newindex] = numbers[i];

        }
        return reverse;
    }

    public static void printArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));

    }
    public static int calculateSum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];



        }
        return sum;
    }


    public static boolean containsNumber(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] == n ){
                return true;
            }
        }

        return false;
    }
}




