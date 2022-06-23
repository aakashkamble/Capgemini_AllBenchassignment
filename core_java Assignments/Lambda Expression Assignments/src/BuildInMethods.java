import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuildInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> sp=()->Math.random();
		Consumer<Integer> cs=(i)->System.out.println(i);
		Predicate<Integer> p = i -> (i > 50);
		Function<Integer, Double> f = (a) -> a / 2.0;
		
		System.out.println("Supplier\n");
		System.out.println(sp.get());
		System.out.println("Predicate\n");
		System.out.println(p.test(70));
		System.out.println("Consumer\n");
		cs.accept(100);
		System.out.println("Function");
		System.out.println(f.apply(250));
	}

}
