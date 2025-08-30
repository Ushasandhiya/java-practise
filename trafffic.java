import java.util.Scanner;
 public class trafffic 
 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the color of the traffic light? ");
        String color = scan.nextLine();
        if(color.equals("red"))
        {
            System.out.println("STOP");
        }
        else if(color.equals("Yellow"))
        {
            System.out.println("GET READY");
        }
        else if(color.equals("green"))
        {
            System.out.println("GO");
        }
    
    
}
 }
