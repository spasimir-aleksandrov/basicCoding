package basicCoding;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTask {

	public HashMap<Integer, Integer> readFile(String fname) throws Exception {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner scanner = null;
		Integer key;
		try {
			scanner = new Scanner(new FileReader(fname));
			} 
		catch(FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			throw e;
		}
		try {
			while (scanner.hasNextLine()) {
				try {
				key = scanner.nextInt();
				}
				catch(InputMismatchException exception) {
					scanner.close();
					throw new RuntimeException();
				}
				map.put(key, map.getOrDefault(key, 0) + 1);
				scanner.close();
			}
		}
		catch(Exception e) {
			throw e;
		}
		return map;
	}
	
	public void printUniqueNumbers(HashMap<Integer, Integer> map){
		System.out.println("The unique numbers are:");
		for (Integer key: map.keySet()) {
			System.out.println(key);
		}
	}
	
	public void printNumbersOccurance(HashMap<Integer, Integer> map){
		for (Integer key: map.keySet()) {
			Integer value = map.get(key);
			System.out.println("The number " + key + " is met " + value + " number of times");
		}
	}
	
	public void printOccuredOnce(HashMap<Integer, Integer> map) {
		System.out.println("The numbers that were met only once are:");
		for (Integer key: map.keySet()) {
			if(map.get(key) == 1) {
			System.out.println(key);
			}
		}
	}
}
