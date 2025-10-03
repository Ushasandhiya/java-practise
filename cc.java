public class cc {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
import java.util.Scanner;
public class avg
{
 public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    int s1 = scan.nextInt();
    int s2 = scan.nextInt();
    int s3 = scan.nextInt();
    int s4 = scan.nextInt();
    int s5 = scan.nextInt();
     int Totalmark = s1+s2+s3+s4+s5;
     int avg = Totalmark/5;
     if(avg<35)
     {
        System.out.println("Additional class is required");
     }
     else
     {
        System.out.println("you're good to go");
     }
