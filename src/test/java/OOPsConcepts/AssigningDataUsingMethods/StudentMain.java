package OOPsConcepts.AssigningDataUsingMethods;

public class StudentMain {
    public static void main(String[] args) {

        //assigning data using object reference variable
        /*Student st=new Student();
       st.setstudentdata(356,"Hassain",'A');
       st.printstudentdata();


       Student st2=new Student();
       st2.setstudentdata(357,"Shaik",'A');
       st2.printstudentdata();*/
       Student st=new Student(356, "Hassain", 'A');
       st.printstudentdata();

       Student st2=new Student(357,"shaik", 'A');
       st2.printstudentdata();
    }



}
