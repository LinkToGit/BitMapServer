package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.bitmap.LongToBitMap;
import com.bitmap.StrToBitMap;

public class Test {
	@org.junit.Test
	public void Demo1() {
		String[] str1 = new String[20000];
		for(int i = 0; i < 20000; i++) {
			str1[i] = Integer.toString(i);
		}
		
		StrToBitMap bitMap = new StrToBitMap(str1);

		for(int i=0; i < bitMap.getLongMax()/64+1; i++) {
			System.out.println("index: " + i + " value: " + bitMap.getBit().get(i));
		}
		
		
		System.out.println(bitMap.getLongMax());
		
		HashMap<String, Long> strsBitMap = bitMap.getAllBitMap();
		
		for (Entry<String, Long> en : strsBitMap.entrySet()) {
			//System.out.println("key: " + en.getKey() + ", value: " + en.getValue());
		}
		
		
	}
	
	@org.junit.Test
	public void Demo5() {
		Long[] ls = new Long[20]; 
		for(int i = 0; i < 20; i++) {
			ls[i] = new Long(i);
		}
		
		LongToBitMap bitMap = new LongToBitMap(ls);
		
		for(int i=0; i < bitMap.getLongSize()/64+1; i++) {
			System.out.println("index: " + i + " value: " + bitMap.getBit().get(i));
		}
		
		ls = new Long[] {0l,8l,9l};
		bitMap.delBitMap(ls);
		for(int i=0; i < bitMap.getLongSize()/64+1; i++) {
			System.out.println("index: " + i + " value: " + bitMap.getBit().get(i));
		}
	}
	
	@org.junit.Test
	public void Demo2() {
		Long a =  0x7fffffffffffffffl;
		Long b = 1l << 0x3f;
		
		System.out.println(a + "\n" + b + "\n");
		
		
		
	}
	
	@org.junit.Test
	public void Demo3() {
		ArrayList<Long> list = new ArrayList<>();
		int size = list.size();
		
		Long[] l = new Long[] {};
		int len = l.length;
		
	}

}
