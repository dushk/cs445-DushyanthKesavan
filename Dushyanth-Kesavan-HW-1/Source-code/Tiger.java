public class Tiger extends Creature
{
    private String name;
    public Tiger(String name)
    {
        super(name);
    }
    public void move()    
    {
        System.out.println(super.toString()+" has just pounced.");
    }
}