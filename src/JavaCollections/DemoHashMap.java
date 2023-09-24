package JavaCollections;
import java.util.HashMap;
public class DemoHashMap {
	public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
    hm.put(12, "John");
    hm.put(2, "Smith");
    hm.put(7, "Peter");
    System.out.println("HashMap object output :" + hm);
    hm.put(2, "Smit");
    System.out.println("After inserting duplicate key :" + hm);
	}
}