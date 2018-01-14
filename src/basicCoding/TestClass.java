package basicCoding;

import java.util.HashMap;
import basicCoding.CountTask;

public class TestClass {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = null;
		try {
			map = CountTask.readFile("text.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		CountTask.printUniqueNumbers(map);
		CountTask.printNumbersOccurance(map);
		CountTask.printOccuredOnce(map);
	}

}
