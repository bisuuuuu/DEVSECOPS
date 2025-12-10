import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
public class MAP {

	public static void main(String[] args) {
		Map<String,Integer> numbers=new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		numbers.put("Six", 6);
		//numbers.remove("Six");
		System.out.println(numbers);
		for(String key :numbers.keySet()) {//iterate over key:keyset
			System.out.print(key+" ");
		}System.out.println(" ");
		for(Integer value:numbers.values()) {//iterate over value:values
			System.out.print(value+" ");
		}System.out.println(" ");
		for(Map.Entry<String,Integer>entry:numbers.entrySet()){//all over key:value pairs use entryset and entry
	System.out.print(entry+" ");

	//System.out.print(entry.getKey()+" "+entry.getValue()+" ");
		}}
	

}
