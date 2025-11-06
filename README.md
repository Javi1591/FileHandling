# Java Assignment 12 – File I/O and Exception Handling

A Java console application that demonstrates the use of **file input/output (I/O)** and **exception handling** for reading and writing structured data.  
This assignment integrates several prior concepts including arrays, loops, and class design to manage persistent data in external files safely and efficiently.

---

## Assignment Overview

### Description
The program reads data from a text file, processes it, and outputs results to the console or another file.  
It showcases structured exception handling through `try`, `catch`, and `finally` blocks, ensuring that errors such as missing files or invalid data are handled gracefully without interrupting program flow.

### Features
- Opens and reads data from a text file using `File`, `Scanner`, or `BufferedReader`.  
- Processes input data to compute summaries, totals, or formatted results.  
- Optionally writes processed output to a new file using `PrintWriter` or `FileWriter`.  
- Implements error trapping for missing files, invalid input, and I/O exceptions.  
- Displays meaningful messages for any runtime exceptions encountered.

### Learning Objectives
- Learn to read and write data from external files.  
- Understand checked versus unchecked exceptions in Java.  
- Apply `try`, `catch`, and `finally` blocks effectively.  
- Reinforce the use of loops and conditional structures in file-based applications.

### Files
- `Nazario_Assignment12.java` (example filename) — main driver program implementing file I/O operations.  
- One or more text files used for reading input or writing output results.

---

## Program Structure
1. **File Input Phase** – Opens a file and reads data line by line.  
2. **Processing Phase** – Performs calculations, aggregations, or data formatting.  
3. **Output Phase** – Displays results in the console or writes to an output file.  
4. **Exception Handling** – Catches `IOException` or other runtime errors and provides safe recovery.  

Each stage is modularized into methods for clarity and reusability.

---

## How to Compile and Run

### Requirements
- Java Development Kit (JDK) 17 or newer  
- Text file(s) with the expected format located in the same directory as the program

### Command Line Instructions
```bash
javac Nazario_Assignment12.java
java Nazario_Assignment12
