package JavaCores;

import java.util.HashMap;
import java.util.TreeMap;

public class Mapp {
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Python",12000);
		hm.put("Java",10000);
		hm.put("MERN",3900);
		hm.forEach((k,v)->{
			System.out.println(k + "->"+v);
			
		});
		System.out.println(hm.get("MERN"));
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1,"Nirlaz");
		tm.put(2,"Niyam");
		tm.put(3,"Laxmi");
		System.out.println(tm);
		System.out.println(tm.get(2));
	}

}
