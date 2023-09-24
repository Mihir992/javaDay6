package JavaCollections;
import java.util.List;
import java.util.ArrayList;
public class DemoArrayList {
	public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
        
        ArrayList<String> languages = new ArrayList<>();

        // add elements in the array list
        languages.add("Java");
        languages.add("Kotlin");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // change the element of the array list
        languages.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + languages);
        
        // creating an array list
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("ArrayList: " + animals);

        // iterate using for-each loop
        System.out.println("Accessing individual elements:  ");

        for (String animal : animals) {
          System.out.print(animal);
          System.out.print(", ");
        }
    }
}
