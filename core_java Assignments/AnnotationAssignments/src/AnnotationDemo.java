import java.util.ArrayList;
@FunctionalInterface
interface X
{
	void show();
	
}
class A
{
	public void showMyData()
	{
		System.out.println("A Class");
	}
}
class B extends A
{
	@Deprecated
	public void show()
	{
		//System.out.println("Hii");
	}
	@Override
	@SuppressWarnings("unchecked")
	public void showMyData()
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(100);
		System.out.println(list);
		System.out.println("B Class");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.showMyData();
		obj.show();
				

	}

}
