package jdk8.lambdaexpressions.collections;

import java.util.TreeMap;

public class SortingElementTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(5, "Five");
		treeMap.put(15, "Fifteen");
		treeMap.put(7, "Seven");
		treeMap.put(12, "Tewel");
		treeMap.put(16, "Sixteen");
		System.out.println(treeMap);
		
		TreeMap<Integer, String> sortTreeMap = new TreeMap<Integer, String>((s1, s2) -> (s1 > s2) ? -1 : (s1 < s2) ? 1 : 0);
		sortTreeMap.put(5, "Five");
		sortTreeMap.put(15, "Fifteen");
		sortTreeMap.put(7, "Seven");
		sortTreeMap.put(12, "Tewel");
		sortTreeMap.put(16, "Sixteen");
		System.out.println(sortTreeMap);
	}
}
