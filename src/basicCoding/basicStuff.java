package basicCoding;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class basicStuff {

	public static void main(String[] args) throws Exception {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner scanner = new Scanner(new FileReader("text.txt"));
		while (scanner.hasNextLine()) {
			Integer key = scanner.nextInt();
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		scanner.close();
	}

}
