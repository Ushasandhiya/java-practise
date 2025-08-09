import java.util.Scanner;
public class loan
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("salary:");
        int salary = scan.nextInt();
        System.out.println("Age:");
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
        System.out.println("Eligible for loan");
        System.out.println("Enter the loan amount you want:");
        int loan = scan .nextInt();
         
        if(loan <= 500000)
        {
            System.out.println("Loan approved");
        }
        else
        {
            System.out.println("Loan not approved");
        }
        }
        else
        {
            System.out.println("Not eligible for loan");
        }
        
        
    }
    
}

