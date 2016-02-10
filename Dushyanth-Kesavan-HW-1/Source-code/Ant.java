public class Ant extends Creature
{
    private String name;
    public Ant(String name)
    {
        super(name);
    }
    public void move()
    {
        System.out.println(super.toString()+" is crawling around.");
    }
}