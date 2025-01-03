package java2.String;

import java.util.Scanner;

public class ToRemoveJunkOrSpecialCharactersFromString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the string");
        String actual = sc.nextLine();
        String cleanedstring = actual.replaceAll("[^a-zA-Z0-9]","");
        // the above regex will match the characters that is not a-z, A-Z and o-9
        System.out.println(actual);
        System.out.println(cleanedstring);

    }
}
