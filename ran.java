import java.util.Scanner;
public class ran {

    Public static void main(String args[]){
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i>1;i<=n;i++){
            if(n%3==0){
                
                System.out.println("fizz");
            }
            else if(n%5==0){
                System.out.println("buzz");
            }
            else if(n%3==0 && n%5==0){
                System.out.println("fizzbuzz");
            }
        }

    }
    
}
