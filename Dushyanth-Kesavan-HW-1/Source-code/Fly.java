public class Fly extends Creature implements Flyer
{
    private String name;
    public Fly(String name)
    {
        super(name);
    }
    public void eat(Thing aThing)
    {
         if (aThing instanceof Creature)
            System.out.println(super.toString()+" won't eat a "+aThing+".");
        else if (aThing instanceof Thing)
            super.eat(aThing);
    }
    public void move()
    {
        fly();
    }
    public void fly()
    {
        System.out.println(super.toString()+" is buzzing around in flight.");
    }
}