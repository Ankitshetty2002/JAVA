import java.util.Scanner;

public class Marks

{

    public static void main(String[] args)

    {

        int marks;

        System.out.println("Enter the marks obtained: ");

        Scanner scan= new Scanner(System.in);

        marks =scan.nextInt();

        if (marks>40)

        {

            System.out.println(" The student is PASSED");

        }

        else

        {

            System.out.println(" The student is FAILED");

        }

    }

}