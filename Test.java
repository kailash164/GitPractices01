import java.util.*;
import java.util.Iterator;

public class Test{
	public static void main(String[] args) {
		List <Integer>al = new ArrayList<>();
		al.add(10);//Integer
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.iterator();
		System.out.println("al: "+al);
		Iterator ite = al.iterator();
		/*while(ite.hasNext()){
			//ite.remove();	//java.lang.IllegalStateException
			System.out.println(ite.next());
		}*/
		System.out.println("al: "+al);
		System.out.println("=========================");
		for(int x:al){
			System.out.println("-----"+x);
			
		}
		//al.forEach((x)->System.out.println(x));
		//System.out.println("************************");
		//ite.forEachRemaining((x)->System.out.println(x));
	}
}