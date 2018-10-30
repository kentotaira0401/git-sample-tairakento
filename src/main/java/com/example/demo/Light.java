package com.example.demo;

public class Light {
	
	private String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Light [Color=" + Color + "]";
	}
	
}
