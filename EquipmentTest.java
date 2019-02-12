public class EquipmentTest
{
	
	public void testFull() throws AssertException
    {
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
    	Assert.assertEquals("Batarang", toBeTested.getName());
    	Assert.assertEquals(5, toBeTested.getCount());
    	Assert.assertEquals(2.5, toBeTested.getTotalWeight());
    	Assert.assertEquals(5.0, toBeTested.getTotalPrice());
    	Assert.assertEquals("bat-shaped boomerangs", toBeTested.getDescription());
    }
	
	public void testToString() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		String actual = toBeTested.toString();
		String expected = "Name: Batarang, Number: 5, Weight: 2.50 lbs, Price: $5.00 - bat-shaped boomerangs";
		Assert.assertEquals(expected, actual);
	}
	
	public void testGetName() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		String actual = toBeTested.getName();
		String expected = "Batarang";
		Assert.assertEquals(expected, actual);
	}
	
	public void testGetCount() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		int actual = toBeTested.getCount();
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}
	
	public void testGetTotalWeight() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		double actual = toBeTested.getTotalWeight();
		double expected = 2.5;
		Assert.assertEquals(expected, actual);
	}
	
	public void testTotalPrice() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		double actual = toBeTested.getTotalPrice();
		double expected = 5.0;
		Assert.assertEquals(expected, actual);
	}
	
	public void testGetDescription() throws AssertException
	{
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		String actual = toBeTested.getDescription();
		String expected = "bat-shaped boomerangs";
		Assert.assertEquals(expected, actual);
	}
	
	public void testEquals() throws AssertException
    {
		Equipment toBeTested = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
		Equipment object = new Equipment("Batarang/5,2.50,5.00,bat-shaped boomerangs");
    	boolean actual = toBeTested.equals(object);
    	boolean expected = true;
    	Assert.assertEquals(expected, actual);
    }
}