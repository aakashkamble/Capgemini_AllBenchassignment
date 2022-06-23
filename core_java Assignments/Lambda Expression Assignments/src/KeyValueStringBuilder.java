import java.util.HashMap;

public class KeyValueStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder();
        HashMap<Integer,String> foo=new HashMap<>();
        foo.put(1,"Apple");
        foo.put(2,"Orange");
        foo.put(3,"Mango");
        
        //this method will make the key value pairs a string using string builder
        foo.entrySet().forEach(t-> sb.append(t));
        System.out.println(sb);

	}

}
