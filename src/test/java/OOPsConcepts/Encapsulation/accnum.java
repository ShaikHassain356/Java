package OOPsConcepts.Encapsulation;

public class accnum {

    private int accnum;
    private String name;
    private int balance;

    int getAccnum() { //get method is used to get the value
        return accnum;
    }

    //we use this keyword if the name of class and local variable is same
    //this keyword represents the class variable

    void setAccnum(int accnum) { //set method is used to set the value
        this.accnum = accnum;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }
}
