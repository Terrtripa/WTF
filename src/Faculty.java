public class Faculty {
    public static void main(String[] args) {

        System.out.println(calcFaculty(3));
        System.out.println(calcFaculty(5));
        System.out.println(calcFaculty(0));

    }

    public static long calcFaculty(int value){
        long faculty = 1;

        for (int i = 1; i < value + 1; i++) {
            faculty = faculty * i;



        }

        return faculty;
    }
}
