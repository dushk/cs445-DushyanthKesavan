public class TestCreature
{
    public static final int CREATURE_COUNT=6;
    public static final int THING_COUNT=10;
    public TestCreature()
    {}
    public static void main(java.lang.String[] args)
    {
        
//Create and print 'Thing' instances (some of which are instances of Tiger)
        Thing[] t = new Thing[THING_COUNT];
        for ( int l=0; l<THING_COUNT-4; l++)
        {
            t[l] = new Thing("newthing"+l);
        }
        for( int m=6; m<THING_COUNT; m++)
        {
            t[m] = new Tiger("newtigthing"+m);
        }
        System.out.println("Things:\n");
        for (int i=0; i<THING_COUNT; i++)
        {
            System.out.println(t[i]);
        }
        System.out.println();
        
//Create and print 'Tiger' instances        
        Tiger[] tig = new Tiger[CREATURE_COUNT];
        for ( int k=0; k<CREATURE_COUNT; k++)
        {
            tig[k] = new Tiger("NewTiger"+k);
        }
        System.out.println("Tigers:\n");
        for (int j=0; j<CREATURE_COUNT; j++)
        {
            System.out.println(tig[j]);
        }
        System.out.println();
        
//Create and print 'Thing' instances    
        Thing[] th = {new Bat("Bunty"), new Thing("Locomotive"), new Ant("Fruit"), new Thing("Banana")};
        
        System.out.println("Things:\n");
        for (int i=0; i<th.length; i++)
        {
            System.out.println(th[i]);
        }
        System.out.println();
        
//Create and print 'Creature' instances and tests the methods 'eat' and 'move' 
        Creature[] c = {new Ant("Andy the"), new Bat("Barry the"), new Tiger("Tigga the"), new Fly("Flint the")};
                
        System.out.println("Creatures:\n");
        for (int p=0; p<c.length; p++)
        {
            c[p].move();
            c[p].eat(th[p]);
        }
        System.out.println();
    }
}
        
        
    
