import java.util.Scanner;
public class leap {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a year");
     int leap = sc.nextInt();

     if(leap%400==0)
        {
        System.out.println(leap + " is leap year ");
        }
    
    else if(leap%100==0)
    {
        System.out.println("not a leap year");
    }
    else if(leap%4==0)
    {
        System.out.println("leap year");

    }
    else{
        System.out.println("not a leap year");
    }

        
    }
    
}

