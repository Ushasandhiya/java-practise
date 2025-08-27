class Animal
{
    String name;
    int age;

    void makesound()
        {
            System.out.println("animal makes sound");
        }
}

class dog extends Animal
{
    String breed; 

    void makesound()
    {
        System.out.println("dog barks");
    }
    void fetch()
    {
        System.out.println("dog is fetching");
    }

}

class cat extends Animal
{
    String color;

    void makesound()
    {
        System.out.println("meoww.....");
    }

    void climb()
    {
        System.out.println("cat is climbing");
    }

}

public class Mainclass
{
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.name = "tim";
        d1.age = 2;
        d1.breed = "golden";
        d1.makesound();
        d1.fetch();

        cat c1 = new cat();
        c1.name = "pinky";
        c1.age = 6;
        c1.color = "white";
        c1.makesound();
        c1.climb();

        
    }
}
