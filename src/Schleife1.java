public class Schleife1 {
    public static void main(String[] args) {

        printOutNumbers();
        inversNumbers();



    }

    public static void printOutNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " , ");
            }
        }


    }
    public static void inversNumbers(){
        for (int i=101;i >=1;i--){
            System.out.print(i + " , ");
        }
    }
}


