// Xavier Nazario
// Student ID# 2512208
// Program writing Fastfood to disk.

package nazario12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FastfoodToDisk {

	public static void main(String[] args) throws IOException {

		Fastfood ff1 = new Fastfood("McDonalds  ", "Big Mac      ", 3.99, 2);
		Fastfood ff2 = new Fastfood("Burger King", "Whopper      ", 3.43, 1);
		Fastfood ff3 = new Fastfood("Wendy's    ", "Single Cheese", 2.99, 4);
		Fastfood ff4 = new Fastfood("chick-fil-a", "Spicy Deluxe ", 2.49, 2);
		// create 4 more of your favorite fast foods

		Fastfood ff5 = new Fastfood("Taco Bell", "Five Layer Burrito", 2.99, 2);
		Fastfood ff6 = new Fastfood("Checkers", "Checkerburger", 1.99, 3);
		Fastfood ff7 = new Fastfood("Charlie's", "Philly Cheesesteak", 5.99, 1);
		Fastfood ff8 = new Fastfood("PDQ", "Chicken Tender Box", 6.99, 1);

		// Store the eight fast foods in an arraylist

		ArrayList<Fastfood> fastFoodList = new ArrayList<>();
		fastFoodList.add(ff1);
		fastFoodList.add(ff2);
		fastFoodList.add(ff3);
		fastFoodList.add(ff4);
		fastFoodList.add(ff5);
		fastFoodList.add(ff6);
		fastFoodList.add(ff7);
		fastFoodList.add(ff8);

		// Write the ArrayList to disk

		try (PrintWriter writer = new PrintWriter(new FileWriter("fastfood.txt"))) {
			for (Fastfood fastfood : fastFoodList) {
				writer.println(fastfood.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("End of Program");
	}

}
