public class TriangleType {

    static Triangle getType(int a, int b, int c)
    {
        if(a<=0||b<=0||c<=0)
            throw new IllegalArgumentException("Length of sides cannot be equal to or less than zero");

        if(a==b&&b==c&&c==a)
            return Triangle.EQUILATERAL;
        else if((a==b)||(b==c)||(c==a))
            return Triangle.ISOSCELES;
        else if(a!=b&&b!=c&&c!=a)
            return Triangle.SCALENE;
        else
            return Triangle.ERROR;
    }


    public static void main(String[] args)
    {
        System.out.println(TriangleType.getType(13, 13, 0));

    }
}

enum Triangle
{
ISOSCELES(0),
EQUILATERAL(1),
SCALENE(2),
ERROR(3);

private int n;
Triangle(int n)
{this.n = n;}
}