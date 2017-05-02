package com.yash.annotation.main;

import java.lang.annotation.Annotation;

import com.yash.annotation.annotations.Course;
import com.yash.annotation.pojo.Student;

public class CustomAnnoationTest {

	public static void main(String[] args) throws Exception{
		Student student=new Student(1001, "Amit");
		Class c=student.getClass();
		System.out.println(c.getName());
		Annotation annotation=c.getAnnotation(Course.class);
		Course course=(Course)annotation;
		System.out.println("-------Student Detail----------");
		System.out.println("ID:"+student.getId());
		System.out.println("Name:"+student.getName());
		System.out.println("-------Course Detail----------");
		System.out.println("Course id : "+course.courseId());
		System.out.println("Course Name : "+course.courseName());
	

	}

}
