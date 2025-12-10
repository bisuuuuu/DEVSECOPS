import java.util.Scanner;
public class LARGEST_SMALLEST {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
		if(x>y) {
			System.out.println(x + " largest");
		}else {
			System.out.println(y + " largest");
		}
	}

}
