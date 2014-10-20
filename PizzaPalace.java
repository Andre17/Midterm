/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Andre Purits>
 * @version <20/10/14>
 */
 import java.util.Scanner;
public class PizzaPalace {

	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   
		System.out.println("Enter the number of people");
      double people = scnr.nextDouble();
      System.out.println("Number of slices for each person");
      double slices = scnr.nextDouble();
      System.out.println("Number of slices per pie");
      double slicespie = scnr.nextDouble();
      double mulNum = 0;
      double divNum = 0;
      mulNum = people * slices;
      divNum = mulNum / slicespie;
      System.out.println("You will need " +Math.ceil(divNum)+ "pizza's.");
      
      
		
		// NOTE
		// The Math class provides a function, ceiling(), which will take a double
		// and return the next higher integer value.
		// For example, Math.ceiling(4.125) would evaluate to 5

	}

}
