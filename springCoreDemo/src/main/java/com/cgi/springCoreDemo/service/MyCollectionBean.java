package com.cgi.springCoreDemo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyCollectionBean {
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	
	// Setters for dependency injection
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	
	// Method to display the collections
	public void displayCollections() {
		if (myList != null) System.out.println("List: " + myList);
		if (mySet != null) System.out.println("Set: " + mySet);
		if (myMap != null) System.out.println("Map: " + myMap);
	}
	
}
