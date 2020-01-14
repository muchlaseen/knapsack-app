package app.muchlas.knapsack;

public class App {

	public static void main(String[] args) {
		Item[] items = { 
				new Item("Elt1", 4, 12), 
				new Item("Elt2", 2, 1), 
				new Item("Elt3", 2, 2),
				new Item("Elt4", 1, 1), 
				new Item("Elt5", 10, 4) };

		Knapsack knapsack = new Knapsack(items, 15);
		knapsack.display();
		Solution solution = knapsack.solve();
		solution.display();
	}
}
