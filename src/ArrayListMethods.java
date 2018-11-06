import java.util.ArrayList;
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> listName = new ArrayList<String>();
		listName.add("element 1");
		System.out.println("This is the first element added		->	"+listName.get(0));
		listName.add(0, "element 2");
		System.out.println("now the first element is this		->	"+listName.get(0));
		System.out.println("   and the second is			->	"+listName.get(1));
		System.out.println("This is the length of the ArrayList	->	"+listName.size());
		System.out.println("This list contein 'Element'		->	"+listName.contains("element"));
		System.out.println("the position of 'element 1' is		->	"+listName.indexOf("element 1"));
		listName.add("element 1");
		System.out.println("   and last's				->	"+listName.lastIndexOf("element 1"));
	}
}
