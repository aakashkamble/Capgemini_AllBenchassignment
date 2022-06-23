import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	String os() default "Symbian";
	int version() default 6;
	
}


@SmartPhone(os="Android",version=6)
class NokiaASerious
{
	String model;
	int size;
	public NokiaASerious(String model, int size) {
		
		this.model = model;
		this.size = size;
	}
	
}

public class AnnotationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NokiaASerious n=new NokiaASerious("Fire",5);
		 
		Class c=n.getClass();
		Annotation an=c.getAnnotation(SmartPhone.class);
		SmartPhone s=(SmartPhone)an;
		System.out.println(s.os());
		

	}

}
