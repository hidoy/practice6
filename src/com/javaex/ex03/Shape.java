package com.javaex.ex03;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	public Shape() {}
	public Shape(String fillColor,String LineColor) {
		this.fillColor=fillColor;
		this.lineColor=LineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor=fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor=lineColor;
	}
	
	
	
	
}

