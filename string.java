import java.util.Scanner;
public class Stringfunc{ 
    public static void main(String args[]){ 
Scanner obj=new Scanner(System.in);
    System.out.println("Enter String 1:");
    String s1=obj.nextLine();
    System.out.println("Enter String 2:");
    String s2=obj.nextLine();
    System.out.println("Enter String 3:");
    String s3=obj.nextLine();
    System.out.println("Enter String 4:"); 
    String s4=obj.nextLine();
    System.out.println("The Four Stored Strings are:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
     
    System.out.println("FINDING OUT STRING LEGTH..");
    System.out.println("String length is: "+s1.length());  
    System.out.println("String length is: "+s2.length());
    System.out.println("String length is: "+s3.length());
    System.out.println("String length is: "+s4.length());

    System.out.println("CHECKING IF TWO STRINGS ARE EQUAL..");
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s1.equalsIgnoreCase(s4));

    System.out.println("DOING STRING COMPARISION..");
    System.out.println(s1.compareTo(s2)); 
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));
    
    
    System.out.println("CONCATING THE STRING..");
    s4=s4.concat(": Mother Tongue");
    System.out.println(s4);

    System.out.println("CONVERTING STRING TO UPPER CASE..");
    String s4upper=s4.toUpperCase();  
    System.out.println(s4upper);
    }
}