class car {
    String model;
    String color;

    car(String m,String c){
        model = m;
        color = c;

    }
    void display()
    {
        System.out.println("Model:" + model + " , Color:"+color);
    }
}

public class Innercar {
    public static void main(String[] args) {
         car car1 = new car("Toyoto","Red");
         car car2 = new car("Honda","black");
         car1.display();
         car2.display();

    }
}
