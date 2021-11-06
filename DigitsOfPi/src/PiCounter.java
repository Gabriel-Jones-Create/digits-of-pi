import java.io.IOException;

public class PiCounter extends TextFileAccessor {
	private final int ASCII_CODE_0 = 48;
	private int mistakes;
	private int[] counts = new int[10];
	public PiCounter(String filename) throws IOException {
		openFile(filename);
		// TODO: initialize variables in constructor
		mistakes = 0;
	}
	public void processLine(String curLine) {
		char[] currentLine = curLine.toCharArray();
		for(int i = 0; i < currentLine.length; i++) {
			if(!Character.isDigit(currentLine[i])) {
				mistakes++;
			}
			else {
				counts[currentLine[i]-ASCII_CODE_0]++;
			}
		}
	}
	public void printReport() {
		for(int i = 0; i < counts.length; i++) {
			System.out.println(i + " " + counts[i]);
		}
		System.out.println("bad symbols: "+ mistakes);
	}
}
