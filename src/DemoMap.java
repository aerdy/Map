import java.util.HashMap;
import java.util.Hashtable;


public class DemoMap {
	public static void main(String[] args) {
		Hashtable table =new Hashtable();
		table.put("1", "satu");
		//table.put("1", null);
		System.out.println(table.get("1"));
		
		HashMap map = new HashMap();
		map.put("1","satu");
		map.put("1", null);
		System.out.println(map.get("1"));
		
	}

}
