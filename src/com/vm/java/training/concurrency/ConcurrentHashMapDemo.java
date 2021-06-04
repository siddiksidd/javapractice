package com.vm.java.training.concurrency;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		//HashMap<String, Integer> hm = new HashMap<String, Integer>();
		ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<String, Integer>();

		hm.put("sai", 78);

		hm.put("kumar", 67);
		hm.put("john", 80);

		System.out.println("elements of map " + hm);
		for(Integer val:hm.values() ) {
			System.out.println(val);
			hm.computeIfAbsent("mahesh", m->68);
}
		//hm.computeIfAbsent("sam", a -> 90);
		//hm.computeIfAbsent("teja", a -> 95);

		/*System.out.println(hm.containsValue(78));
		System.out.println(hm.containsValue(67));
		System.out.println(hm.containsValue(80));
		System.out.println(hm.containsKey("sam"));*/

		System.out.println("element of HashMap " + hm);
	
}
}