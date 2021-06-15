package subject;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Subject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7154349708031059534L;
	protected SubjectKind kind = SubjectKind.Major;
	protected int num;
	protected String name;
	protected String professor;
	protected int Class;
	
	public Subject() {
		
	}
	public Subject(int num, String name) {
		this.num = num;
		this.name = name;

	}
	
	public Subject(int num, String name, String professor, int Class) {

		this.num = num;
		this.name = name;
		this.professor = professor;
		this.Class = Class;
	}
	
	public Subject(SubjectKind kind, int num, String name, String professor, int Class) {
		this.kind = kind;
		this.num = num;
		this.name = name;
		this.professor = professor;
		this.Class = Class;
	}
	

	public SubjectKind getKind() {
		return kind;
	}
	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getclass() {
		return Class;
	}
	public void setClass(int class1) {
		Class = class1;
	}
	
	
	String skind = "none";
	public void printInfo() {
		switch(this.kind) {
		case Major:
			skind = "Maj.";
		case Liberalarts:
			skind = "Lib,";
		default:
			
		}
		System.out.println("kind: " + skind + "num: " + num + " name: " + name + " professor: " + professor + " Class: " + Class);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("과목순번: ");
		int num = input.nextInt();
		this.setNum(num);
		
		System.out.print("과목: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("교수: ");
		String professor = input.next();
		this.setProfessor(professor);
		
		System.out.print("분반: ");
		int Class = input.nextInt();
		this.setClass(Class);
	}
}
