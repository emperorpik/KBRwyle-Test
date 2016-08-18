import java.util.Arrays;
public class ControlStructure 
{	
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			//Create a character array for the periods and the digits with size based on iteration
			char[] periods = new char[5-i];
			char[] numbers = new char[i];
			
			//Fill the arrays with the proper character
			Arrays.fill(periods, (char)'.');
			Arrays.fill(numbers, (char) (i + '0')); //Casts integer to character, only works for ints 1-9 (There are no character representations of multi-digit numbers)
			
			//Constructs strings out of the character arrays
			String periodString = new String(periods);
			String numberString = new String(numbers);
			//Prints the combined strings
			System.out.println( periodString + numberString);
		}
	}

}


//In order for this to work for the nth number, assuming that this request goes for multi-digit numbers, the code could probably be kept to one control structure by leveraging a combination of String.format and String.replace
//by padding an empty string with the requisite number of spaces, then replacing each finding of a space with the desired integer sequence that has been previously been converted to a string