import java.util.Locale;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 105;
        long myLong = 700000000000000L;
        float myFloat = 3.32f;
        double myDouble = 6.65;
        boolean myBoolean = true;
        char myChar = 'A';

        int newInt = myByte;
        System.out.println(newInt);

        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble);

        byte newByte = (byte) myInt;
        System.out.println(newByte);

        double newDouble = myInt;
        System.out.println(newDouble);

        String hello = "Hello Nemanja";
        int lengthOfString = hello.length();

        String helloToUp = hello.toUpperCase();
        System.out.println(helloToUp);

        String toLowerCase = hello.toLowerCase();
        System.out.println(toLowerCase);

        String allCombined = hello + ", " + helloToUp + " and number is: " + lengthOfString;
        System.out.println(allCombined);

        String movie = "My favorite movie is: \n\"Home Alone\"";
        System.out.println(movie);


    }
}
