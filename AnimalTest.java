/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
    
    public void testFull() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	Assert.assertEquals("Yellow", animal.getColor());
    	Assert.assertEquals("Paul", animal.getName());
    	Assert.assertEquals(125.0, animal.getWeight());
    	Assert.assertEquals(41.0, animal.getHeight());
    }

    public void testGetColor() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	String actual = animal.getColor();
    	String expected = "Yellow";
    	Assert.assertEquals(expected, actual);// TODO: test full constructor, getters, and toString
    }
    
    public void testGetName() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	String actual = animal.getName();
    	String expected = "Paul";
    	Assert.assertEquals(expected, actual);
    }
    
    public void testGetWeight() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	double actual = animal.getWeight();
    	double expected = 125.0;
    	Assert.assertEquals(expected, actual);
    }
    
    public void testGetHeight() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	double actual = animal.getHeight();
    	double expected = 41.0;
    	Assert.assertEquals(expected, actual);
    }
    
    public void testToString() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	String actual = animal.toString();
    	String expected = "Paul, a Yellow-colored animal. 125.0 pounds, 41.0 inches\n";
    	Assert.assertEquals(expected, actual);
    }
    
    public void testEquals() throws AssertException
    {
    	Animal animal = new Animal("Yellow", "Paul", 125.0, 41.0);
    	Animal object = new Animal("Yellow", "Paul", 125.0, 41.0);
    	boolean actual = animal.equals(object);
    	boolean expected = true;
    	Assert.assertEquals(expected, actual);
    }
}

