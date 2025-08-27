class person
{
    String name;

    person(String name)
    {
        this.name=name;
    }
}

class employee extends person
{
    employee(String name)
    {
        super(name);
    }
}

public class inherit
{
    public static void main(String[] args) {
        employee e1 = new employee("san");
        e1.name = "san";
        System.out.println(e1.name);
    }

} 