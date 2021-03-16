public class ArrayDemo {
    public static void main(String[] args) {

        /*
        dataype[] name = new datatype[length];
        name[index 0...length] = values of datatype;
        name.length = returns the length
         */
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 99;

        for (int i = 0; i < 5; i++){
            System.out.print(intArray[1] + ", ");
        }

        // Array begins with index 0 => first value
        // Works with most Datatypes
        // = new Datatype[Number of]
    }
}
