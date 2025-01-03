package java2.OOPsConcepts;

public class StudentMain {
    public static void main(String[] args) {

        Student stud1=new Student();
        stud1.sid=123;
        stud1.sgrade='A';
        stud1.sname = "Hassain";
        stud1.ssection='A';

        stud1.printdata();


        Student stud2=new Student();
        stud2.sid=356;
        stud2.sgrade='B';
        stud2.sname = "Shaik";
        stud2.ssection='B';

        stud2.printdata();
        String s=new String("Hassain");



    }
}       
