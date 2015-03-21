package ccc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class sad {

	public static void main(String[] args) {
		Map<String, String> maptest=new LinkedHashMap<String, String>();
		
		maptest.put("one","1");
		maptest.put("two","2");
		maptest.put("three","3");
		maptest.put("four","4");
		maptest.put("five","5");
		maptest.put("six","6"); 
		  
		 for (Entry<String, String>  entry : maptest.entrySet()) {
			System.out.println(entry);
		}
		  
		

	}

}
