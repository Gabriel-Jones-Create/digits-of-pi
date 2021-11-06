public class PiDriver {
	public static void main(String args[]) {
		try {
			PiCounter e = new PiCounter("corruptedDigitsOfPi.txt");
			e.processFile();
			e.printReport();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
