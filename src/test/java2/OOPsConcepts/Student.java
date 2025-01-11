package java2.OOPsConcepts;

public class Student {

    int sid;
    String sname;
    char sgrade;
    char ssection;

    void printdata()//we are using void for this method as it is not returning anything
    {
        System.out.println(sid+"  "+sgrade+"  "+sname+"  "+ssection);
    }
}
