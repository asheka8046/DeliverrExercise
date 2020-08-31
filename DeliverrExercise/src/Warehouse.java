/**
 * 
 */

/**
 * This class contains all the characteristics and functionality of a Warehouse object.
 * 
 * @author Anurag Shekar
 *
 */
public class Warehouse {
	/**
	 * The name of the warehouse.
	 */
	private String name;
	/**
	 * The inventory of the warehouse.
	 */
	private Item[] inventory;
	
	/**
	 * This is the Warehouse class constructor.
	 * @param name  the warehouse's name
	 * @param inventory  the warehouse's inventory
	 */
	public Warehouse(String name, Item[] inventory) {
		setName(name);
		setInventory(inventory);
	}
	
	/**
	 * Returns the warehouse's name.
	 * @return the warehouse's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the warehouse's name to the given name.
	 * @param name  the warehouse's new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the warehouse's inventory.
	 * @return the warehouse's inventory
	 */
	public Item[] getInventory() {
		return this.inventory;
	}
	
	/**
	 * Sets the warehouse's inventory to the given inventory.
	 * @param inventory  the new inventory
	 */
	public void setInventory(Item[] inventory) {
		this.inventory = inventory;
	}
}
