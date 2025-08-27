import java.util.Scanner;

class InvalidageException extends Exception
{
    public InvalidageException(String message)
    {
        super(message);
    }
}

class Invalid
{
    void checkage(int age)
    {
        try{
            if(age<0 || age >150)
            {
                throw InvalidageException("age is invalid");
            }

        }
        catch(Exceptione e){
            System.out.println(e);
        }
    }
}

public class invalid{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        invalid a1 = new invalid();
        a1.checkage(age);
    }
}
