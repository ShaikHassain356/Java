package java2.OOPsConcepts.ConstructorOverloading;

public class Box {

    double length, height, width;

    Box()
    {
        length=width=height=0;
    }

    Box(double l,double h, double w)
    {
      length=l;
      height=h;
      width=w;
    }

    Box(double len)
    {
        length=height=width=len;
    }

    double volume()
    {
        return(length*height*width);
    }
}
