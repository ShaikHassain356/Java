package java2.WrapperClasses;

public class DataConversionFromStringToPrimitiveDataTypes {
    public static void main(String[] args) {
        //String s= "Welcome"; // this we cannot convert because string is in characters

        /*
        //String to Integer
        String s1="100";
        String s2="200";
        System.out.println(s1+s2); //this will do concatination 100200
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // value 300
        */


        //String to double
        /*String s1="150.0";
        String s2="500.5";
        System.out.println(s1+s2);
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
        */

        //String to boolean

         String s="Welcome";
        System.out.println(Boolean.parseBoolean(s)); //always false

        String s1="TRUE";
        System.out.println(Boolean.parseBoolean(s1)); //true

        String s2="false";
        System.out.println(Boolean.parseBoolean(s2)); //false


        //String to character not passible, as we cannot convert multiple characters into single character
    }
}
