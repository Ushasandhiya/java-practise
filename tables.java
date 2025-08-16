import java.util.Scanner;
public class tables
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Table : ");
        int x = scan.nextInt();
        
      
      for(int i=1;i<=10;i=i+1)
      {
        System.out.println(i + " X "+x+ " = " + i*x);
      }
    }
}
