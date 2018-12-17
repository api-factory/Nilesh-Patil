import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ConvertMapDataToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		map.put("map key 1", 3); 
		map.put("map key 2", 4); 
		map.put("map key 3", 5); 
		map.put("map key 4", 6); 
		
		System.out.println("Size of Map: " + map.size()); 
		
		
		Collection<Integer> values = map.values(); //use map.keySet() for keys
		
		List<Integer> list = new ArrayList<Integer>(values); 
		
		System.out.println("Size of Value list from Map: " + list.size()); 
		
		System.out.println("Printing HashMap values as list :"); 
		
		for (Integer value : list) 
		{ 
			System.out.println(value); 
		}


	}

}
