import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

class change implements UnaryOperator<String>{
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}

public class UppercaseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> join = new ArrayList<>();
        join.add("autrelia");
        join.add("india");
        join.add("japan");
        join.add("china");
        join.add("america");
        join.add("england");
        
        join.replaceAll(new change());
        join.stream().collect(Collectors.toList()).forEach(System.out::println);

	}

}
