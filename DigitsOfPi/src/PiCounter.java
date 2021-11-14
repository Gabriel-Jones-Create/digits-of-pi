import java.io.IOException;

/**
 * Represents frequencies of numbers 0-9 in a text file and notes the number of
 * non-digit characters
 * 
 * @author gabrieljones
 *
 */
public class PiCounter extends TextFileAccessor {
	private final int ASCII_CODE_0 = 48; // ASCII code value for the number 0
	private int mistakes; // holds integer number of current mistakes in the text
	private int[] counts; // holds count of each number from 0-9

	/**
	 * Constructs a PiDCounter object based on file if the file name exists,
	 * otherwise throws IOException
	 * 
	 * @param filename name of the file
	 * @throws IOException if input file name does not exist
	 */
	public PiCounter(String filename) throws IOException {
		openFile(filename);
		mistakes = 0;
		counts = new int[10];
	}

	public void processLine(String curLine) {
		// creates character array of the input string
		char[] currentLine = curLine.toCharArray();
		/* for every character in the line, checks if the character is a number, if it
		   is it adds to the respective index of the counts array, otherwise it adds to
		   the mistakes*/
		for (int i = 0; i < currentLine.length; i++) {
			if (!Character.isDigit(currentLine[i])) {
				mistakes++;
			} else {
				counts[currentLine[i] - ASCII_CODE_0]++;
			}
		}
	}

	public void printReport() {
		/* for every number in the counts array, prints the respective number, and count
		   of that number in the inputed text file */
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + " " + counts[i]);
		}
		// prints number of mistakes
		System.out.println("bad symbols: " + mistakes);
	}
}
