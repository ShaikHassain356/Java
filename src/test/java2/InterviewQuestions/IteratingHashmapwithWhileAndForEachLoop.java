package java2.InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHashmapwithWhileAndForEachLoop {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap<Integer,String>();
        hp.put(101,"Hassain");
        hp.put(102,"Shaik");
        hp.put(103,"ShaikHassain");
        hp.put(104,"java");
        hp.put(105,"selenium");

        //while loop
        Iterator<Map.Entry<Integer,String>> it= hp.entrySet().iterator();

        while (it.hasNext())
        {
           Map.Entry<Integer,String> mp = it.next();
            System.out.println(mp.getKey() +"  "+mp.getValue());
        }

        for (Integer x:hp.keySet())
        {
            System.out.println(x +"  "+hp.get(x));
        }
    }
}
