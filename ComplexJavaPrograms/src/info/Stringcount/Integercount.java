package info.Stringcount;

import java.util.HashMap;
import java.util.Map;

public class Integercount {

	public static void main(String[] args) {
		int[] n = { 123, 141, 254 };

		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < n.length; i++) {
			/*System.out.println(n[i]);
*/
			char[] ch = String.valueOf(n[i]).toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (hm.containsKey(ch[j])) {
					hm.put(ch[j], hm.get(ch[j]) + 1);
				} else {
					hm.put(ch[j], 1);
				}
			}
		}
		System.out.println(hm);

	}

}
