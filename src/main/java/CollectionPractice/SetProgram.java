package CollectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram {
	public static void main(String[] args) {
		Set<Integer> hset=new HashSet<Integer>();
		Set<String> hsetstr=new HashSet<String>();
		hset.add(9);
		hset.add(9);
		hset.add(2);
		hset.add(2);
		hsetstr.add("pramodh");
		hsetstr.add("pramodh");
		for(Integer obj: hset) {
			System.out.println(obj);
		}
		Iterator<String> it=hsetstr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());// random order
		}
	}
}
