public abstract class Creature extends Thing
{
    private String name;
    private Thing aThing;
    public Creature(String name)
    {
        super(name);
    }
    public void eat(Thing aThing)
    {
        System.out.println(super.toString()+" has just eaten a "+aThing+".");
    }
    public abstract void move();
    public void whatDidYouEat()
    {
        if (aThing != null)
            System.out.println(super.toString()+" has eaten a "+aThing);
        else
            System.out.println(super.toString()+" has had nothing to eat!");
    }
}