import static org.junit.Assert.*;


import org.junit.Test;

/**
 * 
 */

/**
 * Tests the InventoryAllocator class and basically tests the overall program.
 * 
 * @author Anurag Shekar
 *
 */
public class InventoryAllocatorTest {

	/**
	 * Tests the getCheapestShipment method.
	 */
	@Test
	public void testGetCheapestShipment() {
		// Scenario 1 - order shipped using multiple warehouses
		Item[] orderList1 = new Item[3];
		orderList1[0] = new Item("apple", 5);
		orderList1[1] = new Item("banana", 5);
		orderList1[2] = new Item("orange", 5);
		Warehouse[] warehouseList1 = new Warehouse[2];
		Item[] inventoryW11 = new Item[2];
		inventoryW11[0] = new Item("apple", 5);
		inventoryW11[1] = new Item("orange", 10);
		warehouseList1[0] = new Warehouse("owd", inventoryW11);
		Item[] inventoryW21 = new Item[2];
		inventoryW21[0] = new Item("banana", 5);
		inventoryW21[1] = new Item("orange", 10);
		warehouseList1[1] = new Warehouse("dm", inventoryW21);
		InventoryAllocator scenario1 = new InventoryAllocator(orderList1, warehouseList1);
		String expected1 = "[{ owd: { apple: 5 } }, { owd: { orange: 5 } }, { dm: { banana: 5 } }]";
		assertEquals(expected1, scenario1.getCheapestShipment());
		
		// Scenario 2 - order cannot be shipped because of insufficient inventory
		Item[] orderList2 = new Item[1];
		orderList2[0] = new Item("apple", 1);
		Warehouse[] warehouseList2 = new Warehouse[1];
		Item[] inventoryW12 = new Item[1];
		inventoryW12[0] = new Item("apple", 0);
		warehouseList2[0] = new Warehouse("owd", inventoryW12);
		InventoryAllocator scenario2 = new InventoryAllocator(orderList2, warehouseList2);
		String expected2 = "[]";
		assertEquals(expected2, scenario2.getCheapestShipment());
		
		// Scenario 3 - order cannot be shipped because of insufficient inventory
		Item[] orderList3 = new Item[1];
		orderList3[0] = new Item("apple", 2);
		Warehouse[] warehouseList3 = new Warehouse[1];
		Item[] inventoryW13 = new Item[1];
		inventoryW13[0] = new Item("apple", 1);
		warehouseList3[0] = new Warehouse("owd", inventoryW13);
		InventoryAllocator scenario3 = new InventoryAllocator(orderList3, warehouseList3);
		String expected3 = "[]";
		assertEquals(expected3, scenario3.getCheapestShipment());
		
		// Scenario 4 - order shipped using one warehouse out of multiple warehouses
		Item[] orderList4 = new Item[2];
		orderList4[0] = new Item("apple", 5);
		orderList4[1] = new Item("orange", 5);
		Warehouse[] warehouseList4 = new Warehouse[2];
		Item[] inventoryW14 = new Item[2];
		inventoryW14[0] = new Item("apple", 5);
		inventoryW14[1] = new Item("orange", 10);
		warehouseList4[0] = new Warehouse("owd", inventoryW14);
		Item[] inventoryW24 = new Item[2];
		inventoryW24[0] = new Item("banana", 5);
		inventoryW24[1] = new Item("orange", 10);
		warehouseList4[1] = new Warehouse("dm", inventoryW24);
		InventoryAllocator scenario4 = new InventoryAllocator(orderList4, warehouseList4);
		String expected4 = "[{ owd: { apple: 5 } }, { owd: { orange: 5 } }]";
		assertEquals(expected4, scenario4.getCheapestShipment());
		
		// Scenario 5 - order shipped using one warehouse
		Item[] orderList5 = new Item[3];
		orderList5[0] = new Item("apple", 1);
		Warehouse[] warehouseList5 = new Warehouse[2];
		Item[] inventoryW15 = new Item[2];
		inventoryW15[0] = new Item("apple", 5);
		warehouseList5[0] = new Warehouse("owd", inventoryW15);
		InventoryAllocator scenario5 = new InventoryAllocator(orderList5, warehouseList5);
		String expected5 = "[{ owd: { apple: 1 } }]";
		assertEquals(expected5, scenario5.getCheapestShipment());
		
		
		
	}

}
