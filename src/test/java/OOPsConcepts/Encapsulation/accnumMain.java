package OOPsConcepts.Encapsulation;

public class accnumMain {
    public static void main(String[] args) {
        accnum obj =new accnum();
        obj.setAccnum(10121);
        System.out.println(obj.getAccnum());
        obj.setName("Hassain");
        System.out.println(obj.getName());
        obj.setBalance(475000);
        System.out.println(obj.getBalance());
    }
}
