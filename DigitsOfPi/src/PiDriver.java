/**
 * If given a text file, run Pi Counter and process the file to find the
 * frequencies of the numbers 0-9 and to find the number of non digit
 * characters. Then print each number's frequency and the number of non digit
 * characters.
 * 
 * @author gabrieljones
 *
 */
public class PiDriver {
	public static void main(String args[]) {
		try {
			PiCounter e = new PiCounter("e.txt");
			e.processFile();
			e.printReport();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
