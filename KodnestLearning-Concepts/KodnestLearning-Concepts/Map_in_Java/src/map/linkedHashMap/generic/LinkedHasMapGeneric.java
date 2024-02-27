package map.linkedHashMap.generic;

import java.util.LinkedHashMap;

public class LinkedHasMapGeneric {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put(1, 20); //Error
		lhm.put("key2", "name"); 
		lhm.put(78.09F, true); //Error
		lhm.put(true, 20); //Error
		System.out.println(lhm);

	}

}
