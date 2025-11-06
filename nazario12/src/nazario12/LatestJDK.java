// Xavier Nazario
// Student ID# 2512208
// Program that retrieves latest development kit
// version.

// URL: https://www.oracle.com/technetwork/java/javase/downloads/index.html

package nazario12;

// Import the following utilities
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LatestJDK {
	public static void main(String[] args) {
		// Set URL string from example
		String urlString = "https://www.oracle.com/technetwork/java/javase/downloads/index.html";

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			// while if loop
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				// Search for the specific phrase "JDK Development Kit 22"
				if (line.contains("JDK Development Kit 22")) {
					System.out.println("JDK Development Kit 22");
					break;
				}
			}
			reader.close();
		} catch (MalformedURLException e) {
			System.err.println("The URL is malformed: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("An error occurred while fetching the web page: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
		}
	}
}