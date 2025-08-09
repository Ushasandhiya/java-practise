import java.util.Scanner;

class pract
{
    public static void main(String[] args)
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the score:");
        int score = scan.nextInt();
        
        if(score<50)
        {
            System.out.println("you need to improve");
        }
        else if(score>=50 && score<=70)
        {
            System.out.println("Good job");
        }
        else if(score>=70)
        {
            System.out.println("Excellent performance");
        }
    
        
    }
}


