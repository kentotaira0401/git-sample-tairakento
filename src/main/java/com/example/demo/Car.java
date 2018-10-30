package com.example.demo;
/*
 * 
 * 車を表すドメイン
 * @author taira
 * 
 */
public class Car {

	private Integer speed;
	private String bodyColor;
	
	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
}
