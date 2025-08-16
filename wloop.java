import java .util.Random;
public class wloop{
    
    public static void main(String[] args) {

    Random rand = new Random();
    int newrand = 0;

    while(newrand!=10){
    newrand=rand.nextInt(22);
    System.out.println(newrand);
    }
}
}
