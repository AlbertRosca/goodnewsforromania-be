package org.web.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

	static List<String> a = Arrays.asList("a", "b", "c");
	static List<String> b = Arrays.asList("c", "a");
	static List<String> c = new ArrayList<>();
	public static void main(String[] args) {
		
		for(String s : b) {
			c.add(a.stream().filter(b -> b.equals(s)).findFirst().orElse(null));
		}
		
		System.out.println(c);
		
	}
	
}
