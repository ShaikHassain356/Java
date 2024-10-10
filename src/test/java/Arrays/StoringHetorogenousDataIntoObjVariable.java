package Arrays;

public class StoringHetorogenousDataIntoObjVariable {
    public static void main(String[] args) {
        //StoringHetorogenousDataIntoObjVariable using a Object type array
        Object a[]={100,12.5,"Hello",'A',true};

        //retrieving one value
        System.out.println("the value at the index 2 is: "+a[2]);

        //retrieving all the values using advanced for loop

        for (Object x:a)
        {
            System.out.println("all the values in the object type array are: "+x);
        }

        //retrieving all the values using normal for loop

        for (int i=0; i<=a.length-1;i++)
        {
            System.out.println("all the values of object type array are:" +a[i]);
        }

        //we need to break the loop if the our required data is equal to Hello

        String reqdata = "Hello";
        for (int i=0; i<a.length-1;i++)
        {
            System.out.println("all the values of object type array are:" +a[i]);
            if (a[i]==reqdata)
            {
                break;
            }
        }


    }
}
