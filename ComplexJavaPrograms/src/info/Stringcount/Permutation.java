

package info.Stringcount;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static List<String> getPermutation(String input) {

		List<String> collection = null;

		if (input.length() == 1) {
			collection = new ArrayList<String>();
			collection.add(input);
			return collection;
		} else {
			collection = getPermutation(input.substring(1));

			Character first = input.charAt(0);
			/* System.out.println(first); */

			List<String> result = new ArrayList<String>();
			for (String str : collection) {
				for (int i = 0; i < str.length(); i++) {
					String item = str.substring(0, i) + first + str.substring(i);
					result.add(item);
				}
				String item = str.concat(first.toString());
				result.add(item);
			}
			return result;
		}

	}

	public static void main(String[] args) {

		System.out.println(Permutation.getPermutation("abc"));

	}
}
