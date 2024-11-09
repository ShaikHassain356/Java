package OOPsConcepts.Keywords;

import net.bytebuddy.asm.Advice;

public class ThisKeyword {

    int x, y;

    /*ThisKeyword(int x,int y)// constructor
    {
        this.x=x;
        this.y=y;
    }*/

    void setdata(int x, int y) //user defined method
    {
        this.x=x;
        this.y=y;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        //ThisKeyword tk=new ThisKeyword(100,200);
        ThisKeyword tk=new ThisKeyword();
        tk.setdata(100,200);
        tk.display();
    }
}
