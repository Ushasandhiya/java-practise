import java.util.Scanner;
public class school {

    String passorfail(int sum)
    {
        if(sum>=50)
        {
        return "pass";
        }
        else{
        return "fail";
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("TOTAL MARK : ");
        int san = scan.nextInt();
        school obj = new school();
        String num = obj.passorfail(san);
        System.out.println(num);
        
    }
}
