class vehicle
{
    String brand;
    int year;

    void startengine()
    {
        System.out.println("start engine");

    }
}

class car extends vehicle
{
    String fuelType;

    void startengine()
    {
        System.out.println("car engine starts");
    }

    void drive()
    {
        System.out.println("car is driving");
    }
}

class Truck extends vehicle
{
    int loadcapacity;

    void startengine()
    {
        System.out.println("Truck engine starts");
    }

    void haul()
    {
        System.out.println("Truck is hauling");
    }
}


public class san
{

public static void main(String[] args) {
    
    car c1 = new car();
    c1.brand = "BMW";
    c1.year = 1999;
    c1.fuelType = "idk";
    c1.startengine();
    c1.drive();
    System.out.println(c1.brand);
    System.out.println(c1.year);
    System.out.println(c1.fuelType);

    Truck t1 = new Truck();
    t1.brand = "tata";
    t1.year = 1278;
    t1.loadcapacity = 80;
    t1.startengine();
    t1.haul();
    System.out.println(t1.brand);

}


}



