package javaGarage;
import java.util.Scanner;

public class ScannerLookUp {
	Scanner scan= new Scanner(System.in);
	public void scanHelper()
	{
		// For reading integer
		int n= scan.nextInt();
		
		// For reading a single string word
		String temp=scan.next();	
		
		// For reading multiple words untill end of line using the above temp
		temp+=scan.nextLine();	// If you are writing just scan.nextLine() without above line then it will not work 
				
		scan.close();
	}

}
