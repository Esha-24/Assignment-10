package org.antwalk;

public class Student {
	private String name;
	private float engMarks;
	private float hindiMarks;
	private float mathMarks;
	
	public void getName() {
		//return name;
		System.out.println("Student Name : "+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getEngMarks() {
		//return engMarks;
		System.out.println("English score : "+engMarks);
	}
	public void setEngMarks(float engMarks) {
		this.engMarks = engMarks;
	}
	public void getHindiMarks() {
		//return hindiMarks;
		System.out.println("Hindi score : "+hindiMarks);
	}
	public void setHindiMarks(float hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public void getMathMarks() {
		//return mathMarks;
		System.out.println("Math score : "+mathMarks);
	}
	public void setMathMarks(float mathMarks) {
		this.mathMarks = mathMarks;
	}
	
	public void getTotalMarks() {
		System.out.println("\nTotal score : "+(engMarks+hindiMarks+mathMarks));
	}
	public void getAvgMarks() {
		System.out.println("Average score : "+(engMarks+hindiMarks+mathMarks)/3);
	}
	

}
