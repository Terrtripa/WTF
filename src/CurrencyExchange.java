public class CurrencyExchange {
    public static void main(String[] args) {
    exchangeCurrency("huf", 12);
    exchangeCurrency("SEK", 24);
    exchangeCurrency("USD", 64);
    exchangeCurrency("CAD", 51);
    exchangeCurrency("RON",200);
    exchangeCurrency("USD",100);


    }
    public
    static double exchangeCurrency(String currencyID, double value){
        double converted = 0;
        if (currencyID.equalsIgnoreCase("HUF")){
            converted = value * 328.61;
            System.out.println(converted);
        }else if (currencyID.equalsIgnoreCase("SEK")){
            converted = value * 10.76;
            System.out.println(converted);
        }else if (currencyID.equalsIgnoreCase("USD")){
            converted = value * 1.12;
            System.out.println(converted);
        }else if (currencyID.equalsIgnoreCase("CAD")){
            converted = value * 1.47;
            System.out.println(converted);
        }else {
            System.out.println("Please enter valid currency");
        }

        return converted;
    }
}
