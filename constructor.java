public class Constructor
{
    int num1;
    int num2;
    Constructor()
    {
        num1=30;
        num2=40;
    }
   Constructor(int a)
   {
     num1 = a;
   }
   Constructor(int a,int b)
   {
     num1 = a;
     num2 = b;
   }
   public void display()
   {
       System.out.println("Value1= "+num1);
       System.out.println("Value2= "+num2);
   }
   public static void main(String args[])
   {
        Constructor d1 = new Constructor();
        Constructor d2 = new Constructor(60);
        Constructor d3 = new Constructor(50,90);
        System.out.println("Inside default Constructor");
        d1.display();
        System.out.println("Inside paramaterized Constructor1");
        d2.display();
        System.out.println("Inside paramaterized Constructor2");
        d3.display();
   }        
}