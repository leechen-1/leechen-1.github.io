package com.abc.di06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Some {
	private String[] names;
	private List<String> myList;
	private List<School> schools;
	private Set<String> mySet;
	private Map<String, Object> myMap;
	private Properties myPros;

	public void setNames(String[] names) {
		this.names = names;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}

	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}

	public void setMyPros(Properties myPros) {
		this.myPros = myPros;
	}

	@Override
	public String toString() {
		return "Some [names=" + Arrays.toString(names) + ", myList=" + myList + ", schools=" + schools + ", mySet="
				+ mySet + ", myMap=" + myMap + ", myPros=" + myPros + "]";
	}

}
