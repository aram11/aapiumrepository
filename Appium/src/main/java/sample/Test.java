package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I was happy when I came out to this place and I was working hard";

		List<String> list = Arrays.asList(text.split(" "));

		HashSet<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
			//System.out.println();
		}

	}
}
