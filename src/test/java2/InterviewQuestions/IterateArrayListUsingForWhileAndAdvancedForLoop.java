package java2.InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsingForWhileAndAdvancedForLoop {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        ar.add("Hassain");
        ar.add('A');
        ar.add(123);
        ar.add(null);
        ar.add(10.2);
        ar.add(true);
        //using for loop
        for (int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+",");
        }
        System.out.println();
        //using while loop
        Iterator it= ar.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+",");
        }
        System.out.println();
         //using advanced for loop or for each loop
        for ( Object list:ar)
        {
            System.out.println(list);
        }

    }
}
