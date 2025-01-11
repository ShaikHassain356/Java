package java2.OOPsConcepts;

public class RunningParametersIntoMainMethod {
    public static void main(String[] args) {//values in this array args using run modify config
        System.out.println(args.length);
        for (String value:args)
        {
            System.out.println(value);
        }
    }
}
