//input 3,3,3,4,4
//output 4,4,3,3,3 based on frequency 3-3times 4-2times
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class PALTECHQSMOSTIMP {
	public static void main(String[] args) {
		Integer[]arr={3,3,3,4,4,4};
		Map<Integer,Integer> freq=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			freq.put(val,freq.getOrDefault(val,0)+1);
			
		/*if(freq.containsKey(val)) {
			freq.put(val, freq.get(val)+1);
		}else {
			freq.put(val, 1);
		}	*/
		}System.out.println(freq);
		Arrays.sort(arr, (a, b) -> {
            int fa = freq.get(a);   // frequency of a
            int fb = freq.get(b);   // frequency of b

            if (fa != fb) {
                return fa - fb;     // higher frequency first
            }
            return b-a
            		;            // if same freq, sort by number
        });

        // Step 3: Print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		
		

	}

}
