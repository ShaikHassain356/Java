package WrapperClasses;

public class DataConversionFromPrimitiveDataTypesToString {
    public static void main(String[] args) {
        int i=100;
        double d=100.3;
        char c='H';
        boolean b=true;

        System.out.println(String.valueOf(i)+String.valueOf(d)); //100100.3
        System.out.println(String.valueOf(c)+String.valueOf(b)); //Htrue

    }
}
