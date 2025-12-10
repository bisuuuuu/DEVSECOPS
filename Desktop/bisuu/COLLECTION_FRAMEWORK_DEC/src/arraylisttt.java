import java.util.ArrayList;
public class arraylisttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}System.out.println();
		System.out.println(list);
	}

}
