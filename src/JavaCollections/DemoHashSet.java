
package JavaCollections;
import java.util.HashSet;
public class DemoHashSet {
	public static void main(String[] args){
	      HashSet<String> hs = new HashSet<String>();
	      hs.add("John");
	      hs.add("Smith");
	      hs.add("Peter");
	      System.out.println("Before adding duplicate values " + hs);
	      hs.add("John");
	      hs.add("Smith");
	      System.out.println("After adding duplicate values " + hs);
	      hs.add(null);
	      hs.add(null);
	      System.out.println("After adding null values " + hs);
	      
	      
	   }
}