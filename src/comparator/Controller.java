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
		// --------------Option 1: Using a normal class------------------------------
		
		Comparator<Integer> com = new CompartorImplementation();
		Collections.sort(values, com);

		System.out.println("After Sorting ");
		Controller.printList(values);
		// --------------Option 2: Using Anonymous class------------------------------
		// Step 1: change the class name on the right side to Comparator<Integer>
		Comparator<Integer> com2 = new Comparator<Integer>() 
		// Now without class name provide the complete class details
		// Line 41-50 Class without name followed by semi colon on line 51
		{
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2)
					return 1;

				return -1;
			}
		}
		;
		// --------------Option 3: Using Anonymous class with Lambda expressions--------
		Collections.sort(values, com2);
		Controller.printList(values);
	}

	public static void printList(List<Integer> values) {
		for (int i : values)
			System.out.println(i);
	}

}
