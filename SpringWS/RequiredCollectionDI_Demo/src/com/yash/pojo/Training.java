package com.yash.pojo;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Training {
	private Vector<String> courses;
	private TreeSet<String> trainees;
	private Hashtable<String, String> mentorMentee;
	
	
	
	public Vector<String> getCourses() {
		return courses;
	}



	public void setCourses(Vector<String> courses) {
		this.courses = courses;
	}



	public TreeSet<String> getTrainees() {
		return trainees;
	}



	public void setTrainees(TreeSet<String> trainees) {
		this.trainees = trainees;
	}



	public Hashtable<String, String> getMentorMentee() {
		return mentorMentee;
	}



	public void setMentorMentee(Hashtable<String, String> mentorMentee) {
		this.mentorMentee = mentorMentee;
	}



	public void showDetail(){
		
		System.out.println("---------Course Detail-----------");
		for (String course : courses) {
			System.out.println(course);
		}
		
		System.out.println("----------Trainee Detail---------");
		for (String trainee : trainees) {
			System.out.println(trainee);
		}
		
		System.out.println("---------Mentor and Mentee Detail------------");
		Set<String> mentors=mentorMentee.keySet();
		for (String mentor : mentors) {
			System.out.println(mentor+" --> "+mentorMentee.get(mentor));			
		}	
		
		System.out.println("-----------------Required Types are ------------------");
		System.out.println("courses : "+courses.getClass());
		System.out.println("trainees : "+trainees.getClass());
		System.out.println("mentorMentee : "+mentorMentee.getClass());
	}
}
