/**
 * 
 */
package comparator;

import java.util.Comparator;

/**
 * @author Mayank PC
 * Description: This class provides the implemetation for Comparator<Integer> Interface
 */
public class CompartorImplementation implements Comparator<Integer> {

	// Implements the compare function to return the biggest of the two
	
	// This internally works as if o1 > o2 then swap and 
	// 1 means swap and -1 means dont swap
	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2)
			return 1;

		return -1;
	}

}
