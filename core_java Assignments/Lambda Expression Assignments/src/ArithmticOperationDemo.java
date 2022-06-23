@FunctionalInterface
interface ArithmeticOp
{
	public abstract void arithmetic(int a,int b);
}
public class ArithmticOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOp sum=(int a,int b)->{
			System.out.println("Addition is: "+(a+b));
		};
		sum.arithmetic(10, 20);
		
		ArithmeticOp sub=(int a,int b)->{
			System.out.println("Substraction is :"+(a-b));
		};
		sub.arithmetic(20, 15);
		
		ArithmeticOp mul=(int a,int b)->{
			System.out.println("Multiplication is: "+(a*b));
		};
		mul.arithmetic(4, 4);
		
		ArithmeticOp div=(int a,int b)->{
			System.out.println("Division is: "+(a/b));
		};
		div.arithmetic(20,4);
	}

}
