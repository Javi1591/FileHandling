// Xavier Nazario
// Student ID# 2512208
// Program that reads Fastfood from disk.

package nazario12;

// Import BufferedReader, FileReader, IOException,
// and ArrayList utilities.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FastfoodReader {
	public static void main(String[] args) {
		// ArrayList fastFoodLines
		ArrayList<String> fastFoodLines = new ArrayList<>();

		// File path
		String filePath = "fastfood.txt";

		// Reads file using BufferedReader and FileReader
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				fastFoodLines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Display file
		for (String line : fastFoodLines) {
			System.out.println(line);
		}

	}
}