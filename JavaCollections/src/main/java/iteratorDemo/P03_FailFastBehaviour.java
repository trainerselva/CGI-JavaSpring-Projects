package iteratorDemo;

import java.util.ArrayList;
import java.util.List;

public class P03_FailFastBehaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();
		names.add("Bruce");
		names.add("Julia");
		names.add("Tom");
		
		for (String name : names) {
			if (name.equals("Julia")) {
				// This will throw a ConcurrentModificationException
//				names.remove(name);
				names.add("John");
			}
		}
		
		System.out.println(names);
	}

}
