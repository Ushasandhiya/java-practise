import java.util.Scanner;

class InvalidageException extends Exception
{
    public InvalidageException(String message)
    {
        super(message);
    }
}

class invalidator
{
    void checkage(int age)
    {
        try{
            if(age<0 || age >150)
            {
                throw new InvalidageException("age is invalid");
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class invalid{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        invalidator a1 = new invalidator();
        a1.checkage(age);
    }
}
