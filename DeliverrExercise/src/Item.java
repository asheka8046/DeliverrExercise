/**
 * 
 */

/**
 * This class contains all the characteristics and functionality of a single item.
 * 
 * @author Anurag Shekar
 *
 */
public class Item {
	/**
	 * The name of the item.
	 */
	private String name;
	/**
	 * The desired quantity of this item.
	 */
	private int quantity;
	
	/**
	 * This is the Item class constructor.
	 * @param name  the item's name
	 * @param quantity  the desired quantity of this item
	 */
	public Item(String name, int quantity) {
		setName(name);
		setQuantity(quantity);
	}
	
	/**
	 * Returns the item's name.
	 * @return the item's name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the item's name to the given name.
	 * @param name  the item's new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the desired quantity of this item.
	 * @return the desired quantity of this item
	 */
	public int getQuantity() {
		return this.quantity;
	}
	
	/**
	 * Sets the item's desired quantity to the given quantity.
	 * @param quantity  the item's new desired quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
