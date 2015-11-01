

import java.util.ArrayList;

public class ArrayListTest {

	//Create it
	private ArrayList<String> names = new ArrayList<String>();
	
	public ArrayListTest() {
	
		//add to it
		names.add("Jen");
		String otherName = "Tom";
		names.add(otherName);
		names.add("Jane");
		names.add("John");
		
		//delete from it
		names.remove(0);
		names.remove("John");
		
		//go through it
		//for each - in the list -
		//for each String in the list names
		for(String name : names){
			System.out.println(name + " is on the list");
		}
		
		//get something from list
		String firstOnList = names.get(0);
	}

	public static void main(String[] args) {
		new ArrayListTest();

	}

}
