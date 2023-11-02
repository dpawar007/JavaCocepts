package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapDemoi {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		Map<String, String> lhm = new LinkedHashMap<>();
		Map<String, String> thm = new TreeMap();
		WeakHashMap<String, String> whm = new WeakHashMap<>();
		IdentityHashMap<String, String> idhm = new IdentityHashMap<>();
		Map<String, String> ht = new Hashtable();
		Map<Object,Object> pr = new Properties();
		 
		 

	}

}
