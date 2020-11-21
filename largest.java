
import java.util.Scanner;

public class Marks

{
  
    public static void main(String args[])

    {

        Scanner scan=new Scanner(System.in);

      {

         int n1,n2,n3;

         System.out.println("Enter first number: ");

         n1=scan.nextInt();

         System.out.println("Enter second number: ");

         n2=scan.nextInt();

         System.out.println("Enter third number: ");

         n3=scan.nextInt();

         if (n1>n2)

         {
 
            if(n1>n3)

             {

              System.out.println(" The largest no. is "+n1);

             }

             else

             {

              System.out.println(" The largest no. is "+n3):

             }

         }

         else if(n2>n3)

         {

             System.out.println(" The largest no. is "+n2);

         }

         else

         {

             System.out.println(" The largest no. is "+n3);

         }

      }

    }

}