//    .push  .peek  .pop
import java.util.Stack;
public class STACK {

	public static void main(String[] args) {
		Stack<String> animals=new Stack<>();
		animals.push("bisu");
		animals.push("prakash");
		animals.push("rout");
System.out.println(animals);
System.out.println(animals.peek());
animals.pop();
System.out.println(animals);
	}

}
