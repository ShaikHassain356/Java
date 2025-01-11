package java2.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RetrieveElementsOfTwoDimensionArrayUsingBuiltInMethod {
    public static void main(String[] args) {
        int a[][]={{100,200,300,400},
                {500,600,700,800,900},
                {1000,1100,1200,1300}};

        System.out.println(Arrays.deepToString(a));
        //Arrays.sort(a); //this statement work only for one dimensional array
        //System.out.println(Arrays.deepToString(a));
    }
}
