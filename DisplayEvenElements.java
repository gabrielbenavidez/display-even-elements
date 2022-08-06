/***************************************************
Author    : Gabriel Benavidez
Purpose   : To create two dimensional array that multiplies index x,y location and displays only even elements 
***************************************************/

public class DisplayEvenElements
{
    
	
	public void processArray(int[][] twoDarray) //method 
	{
		int result; 
		
		for (int x = 0; x < twoDarray.length; x++) // outer for loop traverses rows
		{
			
			for (int y = 0; y < twoDarray.length; y++) // inner for loop traverses columns
			{
		        result = x*y; // the result of x*y is stored
				
				
				if((result % 2) != 0) // checks if the result is odd
				{
					
				    System.out.printf("%4s","  "); // if odd prints space
				}
				
				
				else 
				{
					twoDarray [x][y] = result;  // if result is even then the location is populated with result
					System.out.printf("%4d",twoDarray[x][y]); //  prints elements of array
				}
				
			}
			    System.out.printf("%n"); // new line
		}
	}
	
	
	public static void main(String args[])
	{	
		int [][] twoDarray = new int [10][10]; //initializes the array
	    DisplayEvenElements displayEven = new DisplayEvenElements(); //constructs class variable to be able to call method 
		displayEven.processArray(twoDarray); //variable pg calls method	
	}
	
	
}