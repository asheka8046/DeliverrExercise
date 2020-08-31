import static org.junit.Assert.*;


import org.junit.Test;

/**
 * 
 */

/**
 * Tests the Item class.
 * 
 * @author Anurag Shekar
 *
 */
public class ItemTest {

	/**
	 * Tests the getName method.
	 */
	@Test
	public void testGetName() {
		Item item1 = new Item("apple", 1);
		assertEquals("apple", item1.getName());
	}
	
	/**
	 * Tests the getQuantity method.
	 */
	@Test
	public void testGetQuantity() {
		Item item1 = new Item("apple", 1);
		assertEquals(1, item1.getQuantity());
	}
	
	/**
	 * Tests the setName method.
	 */
	@Test
	public void testSetName() {
		Item item1 = new Item("apple", 1);
		item1.setName("orange");
		assertEquals("orange", item1.getName());
	}
	
	/**
	 * Tests the setQuantity method.
	 */
	@Test
	public void testSetQuantity() {
		Item item1 = new Item("apple", 1);
		item1.setQuantity(5);
		assertEquals(5, item1.getQuantity());
	}

}
