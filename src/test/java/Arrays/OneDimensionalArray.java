package Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        /*Declaration approach 1, as we wont use this declaration much as if we
        deaclared the array size, in feature if we add only three values remaining
         small will be wasted, it is static in nature
         */

        /*int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/

        //Declaration approach 2, dynamic in nature
        int a[] ={100,200,300,400,500};

        //To find length of an array
        System.out.println(a.length);

        //To read single value from an array
        System.out.println(a[2]);

        //To read multiple values from an array using looping statement

        for (int i=0;i<= a.length-1;i++)
        {
            System.out.println("all the values from the array are:" +a[i]);
        }

        //enhanced for loop to print all the values of an array

        for (int x:a)
        {
            System.out.println(x);
        }

    }
}
