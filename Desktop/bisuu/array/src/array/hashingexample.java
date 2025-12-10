package array;
import java.util.*;
public class hashingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("enter array size");
		int n=in.nextInt();
		int[] arr = new int[n];
for(int i=0;i<n;i++) {
	arr[i]=in.nextInt();
}
//hash
int[] hash = new int[13];
for(int i=0;i<n;i++) {
	hash[arr[i]]++;
}


//query count
int q;
q=in.nextInt();
while(q-- > 0) {
	int num=in.nextInt();
	System.out.print(hash[num]);
}
int maxfreq=0;
int maxnum = 0;
for(int i=0;i<arr.length;i++) {
	if(hash[i]>maxfreq) {
		maxfreq=hash[i];
		maxnum=i;
	}
}
System.out.println("Number with highest count: " + maxnum + " (count = " + maxfreq + ")");
	}

}
