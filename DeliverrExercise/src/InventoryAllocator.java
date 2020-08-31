

/**
 * 
 */

/**
 * This class contains all the functionality for finding the best way an order can be shipped from a set of warehouses.
 * 
 * @author Anurag Shekar
 *
 */
public class InventoryAllocator {
	/**
	 * The list of items ordered.
	 */
	private Item[] orderList;
	/**
	 * The list of warehouses.
	 */
	private Warehouse[] warehouseList;
	
	/**
	 * This is the InventoryAllocator class constructor.
	 * @param orderList  the list of items ordered
	 * @param warehouseList  the list of warehouses
	 */
	public InventoryAllocator(Item[] orderList, Warehouse[] warehouseList) {
		this.orderList = orderList;
		this.warehouseList = warehouseList;
	}
	
	/**
	 * Returns a String representation of the cheapest order shipment.
	 * @return a String representation of the cheapest order shipment
	 */
	public String getCheapestShipment() {
		String matches = "";
		for (int i = 0; i < warehouseList.length; i++) {
			for (int j = 0; j < warehouseList[i].getInventory().length; j++) {
				for (int k = 0; k < orderList.length; k++) {
					if (orderList[k].getName() == warehouseList[i].getInventory()[j].getName() && (orderList[k].getQuantity() <= warehouseList[i].getInventory()[j].getQuantity() && orderList[k].getQuantity() >= 0)) {
						matches += orderList[k].getName() + "," + warehouseList[i].getName() + "," + orderList[k].getQuantity() + ";";
						orderList[k].setQuantity(orderList[k].getQuantity() - warehouseList[i].getInventory()[j].getQuantity());
					}
				}
			}
		}
		String[] matchesSplit = matches.split(";");
		String result = "";
		if (matchesSplit.length > 1) {
			String[][] matchesArray = new String[matchesSplit.length][3];
			for (int i = 0; i < matchesSplit.length; i++) {
				String[] matchSplit = matchesSplit[i].split(",");
				for (int j = 0; j < matchSplit.length; j++) {
					matchesArray[i][j] = matchSplit[j];
				}
			}
			result = "[";
			if (matchesArray.length != 0) {
				for (int i = 0; i < matchesArray.length; i++) {
					if (i == matchesArray.length - 1) {
						result += "{ " + matchesArray[i][1] + ": { " + matchesArray[i][0] + ": " + matchesArray[i][2] + " } }";
					} else {
						result += "{ " + matchesArray[i][1] + ": { " + matchesArray[i][0] + ": " + matchesArray[i][2] + " } }, ";
					}
				}
			}
			result += "]";
		} else {
			result = "[]";
		}
		return result;
	}
}
