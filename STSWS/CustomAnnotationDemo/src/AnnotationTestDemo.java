import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.METHOD)

@ interface MyAnnotation{
	int value();
}

class TestAnnotation{
	@MyAnnotation(value=20)
	public void testAnnotationMethod(){
		System.out.println("*********testAnnotationMethod()************");
	}
	
	@MyAnnotation(value=30)
	public void testAnnotationMethod1(){
		System.out.println("*********testAnnotationMethod1()************");
	}
}

public class AnnotationTestDemo {
	public static void main(String[] args) throws Exception{
		TestAnnotation testAnnotation=new TestAnnotation();
		Method method=testAnnotation.getClass().getMethod("testAnnotationMethod1");
		MyAnnotation myAnno=method.getAnnotation(MyAnnotation.class);
		System.out.println("Value is : "+myAnno.value());
	}
}


