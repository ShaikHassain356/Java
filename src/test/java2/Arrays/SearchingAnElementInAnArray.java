package java2.Arrays;

public class SearchingAnElementInAnArray {
    public static void main(String[] args) {
        Object a[][]={{100,10.25,"Hello"},
                      {'A',789,"Hi"},
                      {'R',"Iam there",63.0235}};
        Object reqelement=1;
        boolean elementfound = false;
        for (int  i=0;i<a.length;i++)
        {
            for (int j=0;j<a[1].length;j++)
            {
                if (a[i][j].equals(reqelement)) // we should not use == here for primitive data types
                {
                    System.out.println("Required element is found at: ["+i+"]["+j+"]");
                    elementfound =true;
                    break;

                }

            }

        }
        if (elementfound==false)
        {
            System.out.println("element not found");
        }


    }
}
