package java2.OOPsConcepts.AssigningDataUsingMethods;

public class Student {


    int stuid;
    String sname;
    char sgrad;

    void printstudentdata()
    {
        System.out.println(stuid+"  "+sname+"  "+sgrad);
    }

    void setstudentdata(int id,String name, char gr)
    {
        stuid=id;
        sname=name;
        sgrad=gr;
    }

    //Constructor
    //Constructor name should always same as class name
    //assigning data to the class variables
    //mostly we use constructor to assign the data because at the time of object creation constructor automatically invoked
    Student(int id, String name, char gr)
    {
        stuid=id;
        sname=name;
        sgrad=gr;
    }
}
