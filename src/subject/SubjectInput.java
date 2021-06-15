package subject;

import java.util.Scanner;

public interface SubjectInput {
	
	public int getNum();
	
	public void setNum(int num);
	
	public String getName();
	
	public void setName(String name);
	
	public String getProfessor();
	
	public void setProfessor(String professor);
	
	public int getclass();
	
	public void setClass(int Class);
	
	public void getUserInput(Scanner Input);
	
	public void printInfo();
	
	public void setSubjectNum(Scanner input);
	
	public void setSubjectName(Scanner input);
	
	public void setSubjectProfessor(Scanner input);
	
	public void setSubjectClass(Scanner input);

}
