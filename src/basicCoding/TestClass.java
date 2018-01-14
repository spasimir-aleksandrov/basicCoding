package basicCoding;

import java.util.HashMap;
import basicCoding.CountTask;

public class TestClass {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = readFile("text.txt");
		printUniqueNumbers(map);
		printNumbersOccurance(map);
		printOccuredOnce(map);
	}

}
