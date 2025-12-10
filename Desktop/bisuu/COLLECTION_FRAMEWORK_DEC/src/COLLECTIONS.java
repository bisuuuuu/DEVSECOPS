//extra collection cls methods used to find min max frequency and to sort list
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class COLLECTIONS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<>();
list.add(12);
list.add(12);
list.add(15);
list.add(14);
list.add(11);
System.out.println(Collections.min(list));// min count
System.out.println(Collections.max(list));// max count
Collections.sort(list);//asc sort
System.out.print(list);
System.out.println();
Collections.sort(list,Comparator.reverseOrder());//sort desc
System.out.println(list);
System.out.println(Collections.frequency(list, 12));// frequency count
	}

}
