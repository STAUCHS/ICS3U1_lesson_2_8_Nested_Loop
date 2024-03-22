class Example2 extends ConsoleProgram {

  /**
  * Creates a 10x10 Times Table
  * @author: 
  */
  
  public void run() {
    // Output the column header 
    System.out.print("   "); // empty space in top left corner of table

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%4d", i); // %4d formats the string to fill up 4 spaces with integers. If integer does not take up all spaces, empty spaces will be added to the left
    }
    
    System.out.println(""); // Prints new line

    // Outputs the horizontal line
    System.out.print("   ");
    for (int i = 1; i <= 10; i++) {
      System.out.print("----");
    }
    
    System.out.println(""); // Prints new line
    
    // Output the rows
    for (int intRow = 1; intRow <= 10; intRow++) {
      // Print out row header (Column 1)
      System.out.printf("%3s", intRow + "|"); // %3s formats a string that takes up 3 spaces with the specified spring. Right-justifies the string.

        // Print out row details
        for(int intColumn = 1; intColumn <= 10; intColumn++){
          System.out.printf("%4d", intRow * intColumn);
        }

      // Prints new line to start printing the next row
      System.out.println(""); 
    }
    
  }
}
