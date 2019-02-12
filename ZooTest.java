public class ZooTest {
	public void testGetTotalHeight() throws AssertException
	{
		Animal animal = new Animal("Red", "Jimmy", 187.0, 40.0);
		Animal animal2 = new Animal("Blue", "Clark", 134.0, 26.0);
		Animal animal3 = new Animal("Green", "Pepe", 105.0, 16.0);
		
		int count = 3;
		Zoo zoo = new Zoo(count);
		zoo.addAnimal(animal);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		double expected = 82.0;
		
		Assert.assertEquals(expected, zoo.getTotalHeight());
	}
	
	public void getCapacity() throws AssertException
	{
		int count = 3;
		Zoo zoo = new Zoo(count);
		Assert.assertEquals(count, zoo.getCapacity());
	}
	
	public void testToString() throws AssertException
	{
		int count = 3;
		Zoo zoo = new Zoo(count);
		Animal animal = new Animal("Red", "Jimmy", 187.0, 40.0);
		zoo.addAnimal(animal);
		Assert.assertEquals("These animals live in the zoo: \nJimmy, a Red-colored animal. 187.0 pounds, 40.0 inches\n", zoo.toString());
		
	}
}