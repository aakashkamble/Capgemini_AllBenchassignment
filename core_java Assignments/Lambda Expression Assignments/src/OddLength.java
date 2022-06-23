import java.util.ArrayList;
import java.util.List;

public class OddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Akash");
		list.add("Sachin");
		list.add("Giri");
		list.add("Vijay");
		list.add("Hari");
		
		list.removeIf(s -> (s.length())%2!=0);
		
		for(String name :list)
		{
			System.out.println(name);
		}
		
		

	}

}
