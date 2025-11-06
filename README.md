# COP2251 – Java Assignment 12

## Summary
This project demonstrates file input/output operations, object serialization concepts using text storage, and simple network access in Java. It includes programs for writing and reading lists of `Fastfood` objects to and from a file, plus an example of retrieving data from a web page. The assignment focuses on file handling, exception management, and the use of Java I/O and networking APIs.

## Program Behavior
- Fastfood  
  - A simple model class representing a fast-food item with attributes: restaurant name, food name, price, and quantity.  
  - Provides constructors, getters, setters, and a formatted `toString()` for easy file output and console display.

- FastfoodToDisk  
  - Creates multiple `Fastfood` objects and stores them in an `ArrayList`.  
  - Writes the formatted contents of that list to `fastfood.txt` using `PrintWriter` and `FileWriter`.  
  - Demonstrates exception handling, object iteration, and resource management via try-with-resources.

- FastfoodReader  
  - Reads the text file `fastfood.txt` line by line using `BufferedReader` and displays its contents in the console.  
  - Reinforces reading, list storage, and sequential display from disk files.

- LatestJDK  
  - Demonstrates network operations via `java.net.HttpURLConnection`.  
  - Connects to Oracle’s Java SE downloads page and searches for a line containing “JDK Development Kit 22”.  
  - Prints the first matching occurrence if found, with proper exception handling for malformed URLs and I/O errors.

## Key Concepts Demonstrated
- File I/O: Using `BufferedReader`, `FileReader`, `FileWriter`, and `PrintWriter` for reading and writing text files.  
- Object Representation: Formatting data objects with `toString()` for disk persistence.  
- Collections: Managing and iterating through an `ArrayList<Fastfood>`.  
- Networking: Basic HTTP GET requests using `HttpURLConnection`.  
- Exception Handling: Structured `try-catch` blocks with descriptive error messages.  
- Modularization: Simple module declaration in `module-info.java`.

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands (from the `nazario12/src` directory):
javac -d ../out module-info.java nazario12/Fastfood.java nazario12/FastfoodReader.java nazario12/FastfoodToDisk.java nazario12/LatestJDK.java  
java -cp ../out nazario12.FastfoodToDisk  
java -cp ../out nazario12.FastfoodReader  
java -cp ../out nazario12.LatestJDK
