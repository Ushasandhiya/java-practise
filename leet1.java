import java.util.Scanner;
public class leet1
{
public static void main(String args[]){

Scanner sc = new Scanner (System.in);
System.out.println("num:");
int num = sc.nextInt();
while(num!=0){
if(num%2==0){
num = num/2;
}else{
num = num-1;
System.out.println(num);
}
}
}
}