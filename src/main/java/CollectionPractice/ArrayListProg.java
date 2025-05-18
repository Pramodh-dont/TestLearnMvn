package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListProg {
	public static void main(String[] args) {
		List<Integer> AL=new ArrayList<Integer>();
		AL.add(0);
		AL.add(10);
		AL.add(10);
		
		for(Integer k:AL) {
			System.out.print(k+" ");// index order
		}
	}
}
