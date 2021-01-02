import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(1, 13);
		System.out.println(al);
		
		LinkedList list = new LinkedList<>();
		list.add(21);
		list.add(22);
		
		al.addAll(list);
		System.out.println("Append : "+al);
		
		list.add(al);
		System.out.println("Append List : "+list);
		System.out.println(al.get(1));
		int old = (int) al.set(2, 200);
		System.out.println("Old :"+old+" List : "+al); // it will return indexed element and set new value
		 
	//	int removeOld = (int) al.remove(2);
		//System.out.println("Removed element: "+removeOld+" list : "+al); // it will return and remove indexed element  
		
		System.out.println("Index of "+ al.indexOf(22)+ " \t List :"+al);
		al.add(200);
		System.out.println("Index of 200  "+al.lastIndexOf(200)+ "\t List "+al);
		
		List sublist = new ArrayList<>();
				sublist = al.subList(0, 3);
		
		System.out.println("Sub List : "+sublist);
			
		
	}

}
