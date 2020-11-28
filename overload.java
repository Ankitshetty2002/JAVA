public class Overload 
{

        double   result ;
        double area(int a)
        {
            result = 3.14* a * a ;
            return result;
        }
        double area(int a , int b)
        {
            result = a * b;
            return result;
        }
        public static void main(String[] args) {
            Overload m1 = new Overload();
            double  a,b;
            a=m1.area(4);
            System.out.println("area of circle is " + a);
            b=m1.area(2,6);
            System.out.println("area of rectangle is "+b);
           
           
    
        }
}   