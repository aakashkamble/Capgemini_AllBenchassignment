import java.util.Arrays;
import java.util.List;

public class Order_Status {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Order> orders=Arrays.asList(
                new Order(3000),
                new Order(12000),
                new Order(55000),
                new Order(9000));
        orders.stream()
                .filter(t->t.getPrice()>10000)
                .forEach(t -> System.out.println("order is accepted/completed:"+t));
	}

}
