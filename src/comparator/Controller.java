/**
 * 
 */
package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mayank PC
 *
 */
public class Controller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		values.add(1554554545);
		values.add(455);
		values.add(2556544);
		values.add(355);
		values.add(458);
		
		Controller.printList(values);
		// Option 1: Using a normal class
		Comparator<Integer> com = new CompartorImplementation();
		Collections.sort(values, com);
		
		System.out.println("After Sorting ");
		Controller.printList(values);
		
		// Option 2: Using Annonymous Class 
		Comparator<Integer> com2 = new CompartorImplementation()
				{
			
				}
				;
		
	}
	
	public static void printList(List<Integer> values)
	{
		for(int i: values)
			System.out.println(i);
	}

}
