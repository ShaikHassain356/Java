package String;

import java.util.Scanner;

public class ToCountOccurancesOfCharcterInString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String inputstring = sc.nextLine();
        System.out.println("Please enter the character that you want to count");
        char inputchar = sc.next().charAt(0);
        int count =0;
        for (int i=0;i<inputstring.length();i++)
        {
            if (inputstring.charAt(i)==inputchar)
            {
                count++;
            }
        }
        System.out.println("the number of times that given character "+"'"+inputchar+"'"+" repeated in the string is "+count);
    }

}

