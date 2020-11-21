public class Sumeven

{

    public static void main(String[] args)

    {

        int num=0,count=0,sum=0;

        do

        {

            sum=sum+num;

            num=num+2;

            count=count+1;

        }

        while(count<=10);

        System.out.println("Sum of first 10 even number is "+sum);

    }

}