import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

import javax.swing.text.html.FormSubmitEvent.MethodType;


public class TestReflection {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("Employee");
		System.out.println("Name : "+c.getName());
		System.out.println("Superclass : "+c.getSuperclass());
		Class[] classes=c.getInterfaces();
		for (Class class1 : classes) {
			System.out.println("Interface : "+class1);
		}
		int i=c.getModifiers();
		System.out.println("Class Modifier : "+i);
		//constructors
		Constructor[] constructors=c.getConstructors();
		System.out.println("Total Constructors in Employee Class = "+constructors.length);
		
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		//Fields
		System.out.println("---------Fields----------");
		Field[] fields=c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			
		}
		
		Method[] methods=c.getDeclaredMethods();
		System.out.println("--------Method information----------");
		for (Method method : methods) {
			System.out.println("Name : "+method.getName());
			System.out.println("Acc modifier = "+Modifier.toString(method.getModifiers()));
			
		}		
		
	}

}
