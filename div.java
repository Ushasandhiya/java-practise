public class div {
    public static void main(String[] args) {
        
        int oddcount = 0;
        
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("Divisible by 3 and 5 " +i);
            }

        }
        System.out.println(oddcount);
    }
    
}

