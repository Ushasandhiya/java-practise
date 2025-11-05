import java.util.Scanner;
public class ran {

    public static void main(String args[]){
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                
                System.out.println("fizz");
            }
            else if(i%3==0){
                System.out.println("buzz");
            }
            else if(i%5==0){
                System.out.println("fizzbuzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
    
}
