package com.vm.training.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("sachin","batsman");
		hm.put("rahul","coach");
		hm.put("sachin","batsman");
		hm.put("dhoni","wicketkeeper");
		System.out.println("HashMap"+hm);
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("sachin","batsman");
		lhm.put("rahul","coach");
		lhm.put("sachin","batsman");
		lhm.put("dhoni","wicketkeeper");
		System.out.println("LinkedHashMap"+lhm);
		
		TreeMap tm=new TreeMap();
		tm.put("sachin","batsman");
		tm.put("rahul","coach");
		tm.put("sachin","batsman");
		tm.put("dhoni","wicketkeeper");
		System.out.println("TreeMap"+tm);
	}

}
