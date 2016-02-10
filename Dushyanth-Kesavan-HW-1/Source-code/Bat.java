public class Bat extends Creature implements Flyer
{
    private String name;
    public Bat(String name)
    {
        super(name);
    }
    public void eat(Thing aThing)
    {
        if (aThing instanceof Thing)
            System.out.println(super.toString()+" won't eat a "+aThing+".");
        else if (aThing instanceof Creature)
            super.eat(aThing);
    }
    public void move()
    {
        fly();
    }
    public void fly()
    {
        System.out.println(super.toString()+" is swopping through the dark.");
    }
}
    