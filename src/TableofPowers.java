import java.util.Scanner;

public class TableofPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner userint = new Scanner(System.in);
     System.out.println("Learn your squares and cubes!");
     String doAgain = "Yes";
     
     int b = 2;
     int c = 3;
     
     
      while (doAgain.equalsIgnoreCase("yes")) {
        System.out.println("Please enter an interger"); int user = userint.nextInt();userint.nextLine();
        doYourCube(b, c, user);
        {
        	System.out.println("Would you like to continue? Please enter yes to continue?"); doAgain = userint.nextLine(); 
        }
        }
      userint.close();   
	}
	//used void/ set method type because using for math.pow method to assign values to variables b, c, and user
	public static void doYourCube(int b, int c, int user)
	{
		//think of it as the loop will run for each time the user input is greater then a (the counter a is a fluid value as it counts up till the 
		//value from user input. i.e when a =1 loop will run once, when a = 2 loop will run 2, etc
		//in this method the for loop is defining user variable for the method by basically  saying how many times is a less then user input; if user input is 5; a is going to print line
		// 1, 2, 3, 4 and its going to show a to the power of 2 and a to the power of 3 for each print line instance of a 
		//think of the for loop as basically just saying how many times to print/execute the doyouCube method and that method is bascally just calcualting the cubed and squared value of a
		//the user input is saying till what number to stop printing those values
		
		for ( int a= 1; user > a ; a++) {
			  int squared = (int) Math.pow(a, b); 
			  int cubed = (int) Math.pow(a, c);
			  System.out.println(a + "   "  + squared + "   " + cubed);	
			  
			   
		  }
				
	}	 
       
        	 
}


