import java .util.Scanner;
public class free {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = scan.nextInt();
        System.out.println("Enter B:");
        int b = scan.nextInt();
        
        for(int i=a;i<=b;i=i+1)
        {
        System.out.println(i);
        }


    
    }
    
}