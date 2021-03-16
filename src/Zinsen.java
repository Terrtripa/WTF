public class Zinsen {
    public static void main(String[] args) {

   double result = accCalc(1000, 1.5, 10);
        System.out.println("result = " + result);

    }

    public static double accCalc(double startCapital, double rates , int years){
      for (int i = 1; i <= years; i++){
      double calc = startCapital * (1 + rates/100);

      String niceValueStartCapital = String.format("%.2f", startCapital);
      String niceValueCalc = String.format("%.2f" , calc);

          System.out.println("End of " + i + " year " + startCapital + " -> "+ calc);
          startCapital = calc;
      } return startCapital;






    }

}
