import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1 = scan.nextInt();
        System.out.println("Enter num2:");
        int n2 = scan.nextInt();
        int result = (n1 > n2) ? n1 : n2;
        System.out.println("The greater number is: " + result);
    
    }
    
}
