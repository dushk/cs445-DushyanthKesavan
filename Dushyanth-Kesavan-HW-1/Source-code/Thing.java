public class Thing
{
    private String name;
    public Thing(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        if (getClass().getSimpleName().equals("Thing"))
            return name;
        else
            return name+" "+getClass().getSimpleName();
    }
}
