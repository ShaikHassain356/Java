package java2.OOPsConcepts;

public class Employee {

    int empid;
    String empname;
    String emprole;
    int empsal;

    void display()   //user defined method
    {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(emprole);
        System.out.println(empsal);
    }

    /*public static void MainMethodOverloading(String[] args) { //MainMethodOverloading method, execution always starts from MainMethodOverloading method
        Employee emp1 = new Employee(); //Object1
        emp1.empid=123456;
        emp1.empname="Hassain";
        emp1.emprole="QA engineer";
        emp1.empsal=200000;
        emp1.display();

        Employee emp2=new Employee(); //Object2
        emp2.empid=356;
        emp2.empname="Shaik";
        emp2.emprole="Automation Engineer";
        emp2.empsal=2000000;
        emp2.display();
    }*/
}
