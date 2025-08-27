import java.util.Scanner;
public class addition
{
    void sum()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("num 1:");
            int a = scan.nextInt();
            System.out.println("num 2:");
            int b = scan.nextInt();

            System.out.println(a+b);


        }

        int c = 10;
        int d = 20;

        void mul()
        {
            System.out.println(c*d);
        }
    
        public static void main(String[] args) {

            addition san = new addition();
            san.sum();
        }
    
}
