package OOPsConcepts.Inheritance.finalkeyword;

//**** the purpose of final keyword is mostly for security purpose, in order to avoid no one has to use u'r data

final class parent{
    void m1()
    {
        System.out.println("This method is from parent class");
    }
}

class child extends parent{ //this class cannot be inherited as we used final before parent class
    void m2()
    {
        System.out.println("This is the method from child class");
    }
}

public class forclass {

    public static void main(String[] args) {

    }
}
