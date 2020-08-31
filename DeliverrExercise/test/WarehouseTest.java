import static org.junit.Assert.*;


import org.junit.Test;

/**
 * 
 */

/**
 * Tests the Warehouse class.
 * 
 * @author Anurag Shekar
 *
 */
public class WarehouseTest {

	/**
	 * Tests the getName method.
	 */
	@Test
	public void testGetName() {
		Item[] inventory = new Item[2];
		inventory[0] = new Item("apple", 1);
		inventory[1] = new Item("orange", 1);
		Warehouse warehouse1 = new Warehouse("owd", inventory);
		assertEquals("owd", warehouse1.getName());
	}
	
	/**
	 * Tests the getInventory method.
	 */
	@Test
	public void testGetInventory() {
		Item[] inventory = new Item[2];
		inventory[0] = new Item("apple", 1);
		inventory[1] = new Item("orange", 1);
		Warehouse warehouse1 = new Warehouse("owd", inventory);
		assertEquals(inventory.length, warehouse1.getInventory().length);
	}
	
	/**
	 * Tests the setName method.
	 */
	@Test
	public void testSetName() {
		Item[] inventory = new Item[2];
		inventory[0] = new Item("apple", 1);
		inventory[1] = new Item("orange", 1);
		Warehouse warehouse1 = new Warehouse("owd", inventory);
		warehouse1.setName("pmd");
		assertEquals("pmd", warehouse1.getName());
	}
	
	/**
	 * Tests the setInventory method.
	 */
	@Test
	public void testSetInventory() {
		Item[] inventory = new Item[2];
		inventory[0] = new Item("apple", 1);
		inventory[1] = new Item("orange", 1);
		Warehouse warehouse1 = new Warehouse("owd", inventory);
		assertEquals(inventory.length, warehouse1.getInventory().length);
		Item[] newInventory = new Item[1];
		inventory[0] = new Item("banana", 1);
		warehouse1.setInventory(newInventory);
		assertEquals(newInventory.length, warehouse1.getInventory().length);
	}

}
