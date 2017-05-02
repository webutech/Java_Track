package com.yash.colbasics.service;

import java.util.LinkedList;

import com.yash.colbasics.pojo.Section;

public class SectionService {
	
	LinkedList<Section> sections;
	
	public SectionService() {
		sections=new LinkedList<>();
		sections.add(new Section(1, "core java", 101));
		sections.add(new Section(2, "servlet", 101));
	}
	
	public LinkedList<Section> getAllSections(){
		return sections;
	}

	public void addSection(Section section) {
		sections.addFirst(section);
		
	}

}
