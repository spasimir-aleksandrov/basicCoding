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

		System.out.println("The unique numbers are:");
		for (Integer key: map.keySet()) {
			System.out.println(key);
		}

		for (Integer key: map.keySet()) {
			Integer value = map.get(key);
			System.out.println("The number " + key + " is met " + value + " number of times");
		}

		System.out.println("The numbers that were met only once are:");
		for (Integer key: map.keySet()) {
			if(map.get(key) == 1) {
			System.out.println(key);
			}
		}
	}

}
