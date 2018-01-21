package org.bryanleekw.javabrains;

/**
 * @author bryanleekw
 *
 */

public class Triangle {
	
	private int heights;
	private String type;
	
	public int getHeight(){
		return heights; 
	}
	
	public Triangle (String type){
		this.type = type;  
	}

	public Triangle (int height){
		this.heights = height;  
	}
	
	public Triangle (String type, int heights){
		this.type = type;  
		this.heights = heights;
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
		System.out.println(getType() + " Triangle being drawn " + getHeight());
	}
}
