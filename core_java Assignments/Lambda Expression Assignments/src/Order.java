
public class Order {
	float price;

	public Order(float price) {
		super();
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [price=" + price + "]";
	}
	

}
