public class sum {

    void sub(int a,int b)
    {
        System.out.println(a+b);
    }

    void mul(int a,int b)
    {
        System.out.println(a*b);
        System.out.println("multiplied values are");
    }

    void div()
    {
        System.out.println();
    }

    public static void main(String[] args) {
        
        sum san = new sum();
        san.sub(10,10);
        san.mul(3,6);
    }
    
}
