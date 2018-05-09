package info.Stringcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringcount {

	public static void main(String[] args) {

      String s1="ABCAAB";
      char[] ch=s1.toCharArray();
      Map<Character, Integer>hm=new HashMap<>();
      for(int i=0; i<ch.length; i++)
      {
    	  if(hm.containsKey(ch[i]))
    	  {
    		  hm.put(ch[i],hm.get(ch[i])+1);
    	  }
    	  else
    	  {
    		  hm.put(ch[i], 1);
    	  }
      }
      
      Set<Entry<Character, Integer>> entrySet = hm.entrySet();
      for (Entry<Character, Integer> entry : entrySet) {
		System.out.println(entry.getKey()+"============= "+entry.getValue());
	}

	}

}
