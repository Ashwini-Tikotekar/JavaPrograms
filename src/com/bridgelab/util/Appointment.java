package com.bridgelab.util;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String name;
	private List<Patient> listofpatients= new ArrayList<Patient>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Patient> getListofpatients() {
		return listofpatients;
	}
	public void setListofpatients(List<Patient> listofpatients) {
		this.listofpatients = listofpatients;
	}

}
