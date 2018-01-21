package org.bryanleekw.javabrains;

/**
 * @author bryanleekw
 *
 */

public class Triangle {
	
	private String type;
	private int height;

	public Triangle (String type){
		this.type = type;  
	}
	
	public String getType() {
		return type;
	}

	/**
	public void setType(String type) {
		this.type = type;
	}
	 */

	public void draw() {
		System.out.println(getType() + "Triangle being drawn");
	}
}
