package com.abc.bean;

public class PC implements Equipment{
	private String model;
	private String display;
	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}
	public PC() {
		super();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	@Override
	public String toString() {
		return "PC [model=" + model + ", display=" + display + "]";
	}
	
	@Override
	public String getDescription() {
		// ´÷¶û(nec17´ç)
		return model + "(" + display + ")" ;
	}
	
}
