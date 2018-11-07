import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> listName = new ArrayList<String>();
		listName.add("element 1");
		System.out.println("This is the first element added		->	"+listName.get(0));
		listName.add(0, "element 2");
		System.out.println("now the first element is this		->	"+listName.get(0));
		System.out.println("-and the second is			->	"+listName.get(1));
		System.out.println("This is the length of the ArrayList	->	"+listName.size());
		System.out.println("This list contein 'Element'		->	"+listName.contains("element"));
		System.out.println("the position of 'element 1' is		->	"+listName.indexOf("element 1"));
		listName.add("element 1");
		System.out.println("-and last's				->	"+listName.lastIndexOf("element 1"));
		listName.remove(listName.lastIndexOf("element 1")); //erase the last element with that position
		listName.remove("element 2");//remove that especific element
		listName.clear(); //remove all the list
		System.out.println("Is this list is empty?			->	"+listName.isEmpty());
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two words (only the first two will be taken in account)");
		listName.add(sc.next());
		listName.add(sc.next());
		sc.close();
		ArrayList newList = (ArrayList) listName.clone();
		listName.clear();
		System.out.println("This is the 2nd word you entered was "+newList.get(1));
		System.out.println("And the 1st was "+newList.get(0));
		Object[] array = newList.toArray();
		System.out.println("now this arraylist is also an array: "+array[0]+array[1]);
	}
}
