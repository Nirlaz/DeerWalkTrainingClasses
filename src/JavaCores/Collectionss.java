package JavaCores;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
public class Collectionss {
	public static void main(String[] args) {
//		interface => no obj(no constructor);
		List<String> mylist = new ArrayList<>();
		mylist.add("Hello");
		mylist.add("Gnawali");
		mylist.add("Nirlaz");
		mylist.indexOf("Nirlaz");
		System.out.println(mylist);
		
		System.out.println("--------------------------");
		LinkedList newListLinked = new LinkedList<>();
		newListLinked.add("Java");
		newListLinked.add(false);
		newListLinked.add(45);
		newListLinked.remove(false);
		System.out.println(newListLinked);
		
		
		//4 methods => for-each methode,iterator,listiterator(List only),lamda method,enumeration
		System.out.println("--------------------------");
		
		for(String str:mylist) {
			System.out.println(str +"\t"+str.length());
			StringBuffer buffer = new StringBuffer(str);
			System.out.println(buffer.reverse());
		}
		
		System.out.println("--------------------------");
		mylist.forEach(str->{
			System.out.println(str);
		});
		
		System.out.println("--------------------------");
		 
		Iterator Itrator = mylist.iterator();
		while(Itrator.hasNext()) {
			String nextString =(String) Itrator.next();
			System.out.println(nextString);
		}
		
		System.out.println("--------------------------");
//		Hashset
		HashSet<String> hs = new HashSet<String>();
		hs.add("Nirlaz");
		hs.add("Niyam");
		hs.add("Nirmal");
		
		for(String str:hs) {
			System.out.println(str+" "+str.length());
			
		}
		
		System.out.println("--------------------------");
		//Treeset
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Nirlaz");
		ts.add("Niyam");
		ts.add("Nirmal");
		for(String str:ts) {
			System.out.println(str+" "+str.length());
		}
		
		
		
	}
}
