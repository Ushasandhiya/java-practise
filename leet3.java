import java.util.Scanner;
public class richest {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("enter number of customers:");
int row = sc.nextInt();
System.out.println("Enter number of bank accounts each customer has:");
int cols = sc.nextInt();
int[][] accounts = new int[rows][cols];
