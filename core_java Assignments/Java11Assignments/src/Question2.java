interface calculateSum{
	int sum(int x,int y);
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateSum c=(var x,var y)->x+y;
		System.out.println("The addition of two number is: "+c.sum(2, 4));
	}

}
