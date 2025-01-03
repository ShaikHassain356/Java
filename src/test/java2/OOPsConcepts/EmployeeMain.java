package java2.OOPsConcepts;
//if we are using the variables from other class we need to import that package
//import package.OOPsConcepts.Employee
//as we are using in the same package no need to use above statement
public class EmployeeMain {
    public static void main(String[] args) {
        // we can use variables of different classes by using the object in MainMethodOverloading method
        //MainMethodOverloading method can be specified only in one class
        //that class becomes MainMethodOverloading class and rest all are plain class
        //as we create a object using the class Employee to import variables and methods in this class
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
    }
}
