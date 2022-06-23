import java.util.ArrayList;
import java.util.List;

public class FirstLetterStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> Names=new ArrayList<>();
	        Names.add("Akash");
	        Names.add("Suraj");
	        Names.add("Neeraj");
	        Names.add("Mandar");
	        Names.add("Ravi");

	        StringBuilder result=new StringBuilder();
	        Names.forEach(s ->result.append(s.charAt(0)));
	        System.out.println(result+" ");

	}

}
