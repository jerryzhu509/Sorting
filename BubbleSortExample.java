import java.util.*;

/**
 * This program demonstrates the use of the sorting algorithm Bubble Sort
 * 
 * ICS4U0 with Mrs. Krasteva
 * 
 * @author Richard Hanxu
 */
public class BubbleSortExample
{
  /** Scanner object */
  final static Scanner input = new Scanner (System.in);
  
  /** Array storing integers */
  int[] arr;
  
  /**
   * Default constructor, sets the size of the array to 3
   */
  public BubbleSortExample()
  {
    arr = new int [3];
  }
  
  /**
   * Sets the size of the array to the value of the parameter
   * @param size The size of the array
   */
  public BubbleSortExample(int size)
  {
    arr = new int [size];
  }
  
  /**
   * Sets the value of the elements in the array
   */
  public void setContents()
  {
    System.out.println("Enter the " + arr.length + " elements for your array!");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println("For element " + i + ": ");
      while(true)
      {
        try
        {
           arr[i] = input.nextInt();
           break;
        }
        catch(InputMismatchException e)
        {
          System.out.println("Invalid input!");
        }
      }
    }
  }
  
  /**
   * Helper method that outputs the contents of the array
   */
  public void outputContents ()
  {
    
    for(int i = 0; i < arr.length; i++)
    {
      System.out.print("[" + arr[i] + "] ");
    }
    System.out.println();
    System.out.println();
  }
  
  /**
   * Performs the Bubble Sort algorithm to the array of the object
   */
  public void bubbleSort()
  {
    // The boolean value is set to a specified value that 
    // also serves as the required condition in the following loop
    boolean swapOccured = true;
    
    System.out.print("Initial Order:\t");
    outputContents();
    
    // While a swap has been made
    while(swapOccured == true)
    {
      
      // Sets the boolean to the opposite value
      swapOccured = false;
      // Iterates through the loop
      for(int i = 0; i < arr.length - 1; i++)
      {
        // If two adjacent elements are out of order, 
        // their positions are switched, and the boolean is set
        // to the value indicating a swap has been made
        if(arr[i] > arr[i+1])
        {
          int placeholderVariable = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = placeholderVariable;
          swapOccured = true;
        }
      }
      
      System.out.print("After a run through: ");
      outputContents();
      
      // If the boolean value indicates a swap has occured, the 
      // loop repeats. Otherwise, the loop exits
    }
    
    System.out.println("Bubble sort completed!");
  }
  
  /**
   * Runs the program
   * @param args The command line arguments
   */
  public static void main(String[] args)
  {
        
    BubbleSortExample myArray = new BubbleSortExample(5);
    myArray.setContents();
    myArray.bubbleSort();
    
    
  }
}