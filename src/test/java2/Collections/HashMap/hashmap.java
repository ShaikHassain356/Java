package java2.Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        //1) Declaration
        //HashMap hm=new HashMap();

        //Map hm=new HashMap(); // child class object cam be stored in the parent class variable
         HashMap<Integer,String> hm=new HashMap<Integer,String>(); // if we know that what type of data we are storing

        hm.put(356,"Hassain");
        hm.put(357,"Sajeed");
        hm.put(358,"Imran");
        hm.put(359,"Hitesh");
        hm.put(360,"Sandeep");
        hm.put(357,"Ram");

        System.out.println(hm); //{356=Hassain, 357=Ram, 358=Imran, 359=Hitesh, 360=Sandeep}

        //2) to get value of a key

        System.out.println(hm.get(356));

        //3) To find the size of HashMap
        System.out.println(hm.size());

        //4) To replace a value

        hm.replace(356,"Hassain","Rockz");
        System.out.println(hm);

        //5) to check whether key is present or not

        System.out.println(hm.containsKey(356));

        //6) To check whether HashMap is empty or not

        System.out.println(hm.isEmpty());

        //7) To remove the pair

        hm.remove(356,"Rockz");
        System.out.println(hm);

        //8) to get all the keys

        System.out.println(hm.keySet());//[357, 358, 359, 360]

        //9) To get all the values

        System.out.println(hm.values()); //[Ram, Imran, Hitesh, Sandeep]

        //10) To get keys along with values

        System.out.println(hm.entrySet()); //[357=Ram, 358=Imran, 359=Hitesh, 360=Sandeep]

       //11) Retrieving the values using for...each loop

        /*for (Integer x:hm.keySet())
        {
            System.out.println(x+"   "+hm.get(x));
        }*/

        //Using Iterator

        Iterator<Map.Entry<Integer,String>> it =hm.entrySet().iterator();

        while (it.hasNext())
        {
             Map.Entry<Integer,String> entry =it.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }

        //12) To clear all the data

        hm.clear();
        System.out.println(hm); //{}

        System.out.println(hm.isEmpty());  //true

        //{} represents list, [] represents set











    }
}
