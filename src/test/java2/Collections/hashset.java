package java2.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        //1) Declaration

        HashSet myset=new HashSet();
        //Set myset=new HashSet(); child class object can be stored in parent class variable
        //if we want to store specific data

        //HashSet<String> myset=new HashSet<String>();
        //HashSet<Integer> myset=new HashSet<Integer>();

        //2) adding the values to HashSet

        myset.add("Hassain");
        myset.add(100);
        myset.add('A');
        myset.add(true);
        myset.add(10.05);
        myset.add(100);
        myset.add(null);
        myset.add(null);

        //to print all the values in HashSet
        System.out.println("All the values in the HashSet are: "+myset); //All the values in the HashSet are: [null, A, 100, Hassain, 10.05, true]

        //3) To find size of HashSet

        System.out.println(myset.size()); //6

        //4) To remove value from Hashset

        myset.remove(100);
        System.out.println("After removing the value: "+myset); //After removing the value: [null, A, Hassain, 10.05, true]

        //5) to retrieve specific element in HashSet, we need to convert HashSet to ArrayList

        ArrayList mylist =new ArrayList(myset);
        System.out.println("After converting: "+mylist);

        System.out.println(mylist.get(2));

        //To read all the values from HashSet using for each loop

        /*for (Object x:myset)
        {
            System.out.println(x);
        }*/

        //Using Iterator

        Iterator it =myset.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //6) To remove all the elements from HashSet


        myset.clear();
        System.out.println(myset); //[]

        //7) To check whether there are any values in the HashSet

        System.out.println(myset.isEmpty()); //true




    }
}
