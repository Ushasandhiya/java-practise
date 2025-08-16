import java.util.Scanner;
public class mid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0;i<=size; i=i+1) {
            arr[i] = scan.nextInt();
        }

    }
}
