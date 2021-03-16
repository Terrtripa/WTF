public class ifLoopYear {
    public static void main(String[] args) {

        int count = 0;
        for (int i =0;i <=2100; i++)
           if (ifLoopYear(i)) {
               count++;
           }
        System.out.println("count = " + count);
    }
    public static boolean ifLoopYear(int year){

        if (year % 100 ==0 ){
            if (year % 400 ==0){
                System.out.println(year + " is a leap year");
                return true;
            }
        }else {
            if (year % 4 ==0){
                System.out.println(year + " is a leap year");
                return true;
            }
        }

            return false;
    }
}
