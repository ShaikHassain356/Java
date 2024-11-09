package OOPsConcepts.Keywords;

public class StaticKeyword {
    int empid;
    String empname; //non-static variable
    static String empdep="QualityAssurance"; //static variable
    int empsalary;
    static int i=100;//static variable
    int j=200;

    static void m1()
    {
        System.out.println("Hi hassain");
    }

    void m() //non-static method can access both all the stuff
    {
        System.out.println(empdep);
        System.out.println(j);
        m1();
    }

    void printdata()// non-static method
    {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(empdep);
        System.out.println(empsalary);
    }

    //if we separate the main method into different class then we need to specify the class name in which variable or method being stated only for static stuff
    //like System.out.println(StaticKeyword.i);
    //StaticKeyword.m1();
    public static void main(String[] args) {
        StaticKeyword emp1=new StaticKeyword();
        emp1.empid=356;
        emp1.empname="Hassain"; // in this object dep QA will be print
        emp1.empsalary=30000;
        emp1.printdata();

        StaticKeyword emp2=new StaticKeyword();
        emp2.empid=357;
        emp2.empname="Shaik";
        emp2.empsalary=30000;
        emp2.empdep="QA lead"; //here QA lead will be print
        emp2.printdata();

        StaticKeyword emp3=new StaticKeyword();//static method can access non-static variable and non-static methods with object
        emp3.empid=358;
        emp3.empname="Shaik Hassain";
        emp3.empsalary=30000; //here also dep QA lead will get printed
        emp3.printdata();

        System.out.println(i);//static method can access static variable and static methods without object
        m1();


    }
}
