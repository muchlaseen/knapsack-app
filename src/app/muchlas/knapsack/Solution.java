package app.muchlas.knapsack;

import java.util.List;

public class Solution {

	public List<Item> items;
	public int value;
	
	public Solution(List<Item> items, int value) {
		this.items = items;
		this.value = value;
	}
	
	public void display() {
		
		if (items != null && !items.isEmpty()) {
			System.out.println("\nKnapsack Solution");
			System.out.println("Value = " + value);
			System.out.println("Items to pick : ");
			
			for (Item item : items) {
				System.out.println("- " + item.toString());
			}
		}
	}
}
