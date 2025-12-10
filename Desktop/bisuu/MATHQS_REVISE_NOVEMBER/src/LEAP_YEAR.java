import java.util.*;
public class LEAP_YEAR {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			if((x%4==0 && x%100!=0)||(x%400==0)){
				System.out.println(x+ " is a leap year");
			}else {
				System.out.println("not a leap yr");
			}
	}

}
