public class twi {

    String getname()
    {
        return  "Sandhiya" ;
    }

    String getphone()
    {
        return "9345868358";
    }

    String getaddress()
    {
        return "tiruvarur" ;
        
    }

    public static void main(String[] args) {
        twi san = new twi()
        String store = san.getname();
        System.out.println(store);]
        String add = san.getphone();
        System.out.println(add);m
        String ph = san.getaddress();
        System.out.println(ph);
    }
    
}
