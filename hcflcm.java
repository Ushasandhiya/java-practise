import java.util.Scanner;

public class hcflcm {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
         
        int min;
        if(num1<num2)
        {
            min = num1;
        }
        else
        {
            min = num2;
            
        }
        
        int HCF = 1;
        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                HCF = i;
    
            }
        }

        int LCM = (num1*num2)/HCF;
        

        System.out.println("HCF is : "+ HCF);
        System.out.println("LCM is : "+ LCM);


    }
    
}
