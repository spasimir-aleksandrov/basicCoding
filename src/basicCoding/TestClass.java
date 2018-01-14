package basicCoding;

import java.util.HashMap;
import basicCoding.CountTask;

public class TestClass {

	public static void main(String[] args) {
		CountTask count = new CountTask();
		HashMap<Integer, Integer> map = null;
		try {
			map = count.readFile("text.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		count.printUniqueNumbers(map);
		count.printNumbersOccurance(map);
		count.printOccuredOnce(map);
	}

}
