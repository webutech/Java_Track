package com.yash.service;

import com.yash.model.Programmer;
import com.yash.model.Tester;

public class PersonService {	
	private Programmer programmer;
	private Tester tester;
	public Programmer getProgrammer() {
		return programmer;
	}
	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}
	public Tester getTester() {
		return tester;
	}
	public void setTester(Tester tester) {
		this.tester = tester;
	}
}
