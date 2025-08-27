import java.util.Scanner;

class DivisionExample
{
    void dividenumbers(int num,int den)
    {
        try{
            int result = num/den;
        }

        catch(ArithmeticException e)
        {
            System.out.println("Denominator cannot be zero");
        }
        finally{
            System.out.println("Execution completed");
        }
    }
}

public class error{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        DivisionExample obj = new DivisionExample();
        obj.dividenumbers(n1, n2);
    }
}
