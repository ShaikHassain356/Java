package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        //1) Declaration of ArrayList

        ArrayList mylist = new ArrayList();
        //List mylist =new ArrayList();  //child class object is stored in parent class

        //if we want to store only homogenous data the declaration is

        //ArrayList<Integer> mylist = new ArrayList<Integer>(); //we need to specify wrapper class not the primitive data
        //ArrayList<String> mylist =new ArrayList<String>();

       //2) Adding data to the ArrayList

       mylist.add(100);
       mylist.add("Hassain");
       mylist.add(102.35);
       mylist.add("Shaik");
       mylist.add(100);
       mylist.add('A');
       mylist.add(null);
       mylist.add(null);

       //3) Finding size of ArrayList
        System.out.println(mylist.size()); //8

        //4) Printing the data
        System.out.println("Elements in the ArrayList is: "+mylist); //Elements in the ArrayList is: [100, Hassain, 102.35, Shaik, 100, A, null, null]

        //5) Deleting data in ArrayList
        mylist.remove(5);
        System.out.println("After removing the value at index 5, data is: "+mylist); //After removing the value at index 5, data is: [100, Hassain, 102.35, Shaik, 100, null, null]

        //6) Inserting the data
        mylist.add(2,"ShaikHassain");
        System.out.println("After Inserting the data at index is: "+mylist); //After Inserting the data at index is: [100, Hassain, ShaikHassain, 102.35, Shaik, 100, null, null]

        //7) removing data using object name
        mylist.remove("Hassain");
        System.out.println("After the object: "+mylist); //[100, ShaikHassain, 102.35, Shaik, 100, null, null]

        //8) updating the data
        mylist.set(2,"Hello");
        System.out.println("After updating the value: "+mylist); //After updating the value: [100, ShaikHassain, Hello, Shaik, 100, null, null]

        //9) reading one value
        System.out.println(mylist.get(1)); //ShaikHassain

        //10) reading each value using looping statements
        //for loop

        /*for (int i=0;i< mylist.size();i++)
        {
            System.out.println(mylist.get(i));
        }*/

        //using advanced for loop

        /*for (Object h:mylist)
        {
            System.out.println(h);
        }*/

        //using Iterator

        Iterator it= mylist.iterator(); //basically iterator is a cursor

        //Iterator will check whether the value is present or not

        while (it.hasNext()) //this will move to the next value
        {
            System.out.println(it.next()); //this will print the value before the moving
        }

        //10) to find whether ArrayList is empty or not
        System.out.println(mylist.isEmpty());

        //10) to remove multiple random values from ArrayList
        //remove all() method will take parameter, so whatever the values we need to remove they need to added in another ArrayList
        ArrayList mylist2=new ArrayList();
        mylist2.add(100);
        mylist2.add("ShaikHassain");

        mylist.removeAll(mylist2);
        System.out.println("After removing the values: "+mylist);

        //11) To remove all thw values in ArrayList
        mylist.clear();
        System.out.println("After clearing all the value: "+mylist);
        System.out.println(mylist.isEmpty());










    }


}
