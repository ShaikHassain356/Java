package OOPsConcepts.Inheritance;

class Bank{
    double rateofinteret()
    {
        return 0;
    }
}

class HDFC extends Bank{
    double rateofinteret()
    {
        return 5;
    }
}

class ICICI extends Bank{
    double rateofinteret()
    {
        return 10;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ICICI ic=new ICICI();
        System.out.println(ic.rateofinteret());

        HDFC hd=new HDFC();
        System.out.println(hd.rateofinteret());



    }
}
