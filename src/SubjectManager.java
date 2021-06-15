import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import subject.LiberalartsSubject;
import subject.MajorSubject;
import subject.SubjectInput;
import subject.SubjectKind;

public class SubjectManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 679759195701795949L;
	
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	transient Scanner input;
	SubjectManager(Scanner input){
		this.input = input;
	}
	
	public void addSubject() {
		int kind = 0;
		SubjectInput subjectInput;
		while (kind < 1 || kind > 2) {
			try {
				System.out.print("1 for Major\n");
				System.out.print("2 for Liberalarts\n");
				System.out.print("Select num for Subject Kind:");
				kind = input.nextInt();
				if (kind == 1) {				
					subjectInput = (SubjectInput) new MajorSubject(SubjectKind.Major);
					subjectInput.getUserInput(input);
					subjects.add(subjectInput);
					break;
				}
				else if (kind == 2) {
					subjectInput = (SubjectInput) new LiberalartsSubject(SubjectKind.Liberalarts);
					subjectInput.getUserInput(input);
					subjects.add(subjectInput);
					break;
				}
				else {
					System.out.print("Select num for Subject Kind between 1 and 2:");
					
				}
				
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 2!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}

			
		}	


	}
	public void deleteSubject() {

		System.out.print("과목순번: ");
		int subjectNum = input.nextInt();
		int index = findIndex(subjectNum);
		removefromSubjects(index, subjectNum);

	}
	public int findIndex(int subjectNum) {
		int index = -1;
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getNum() == subjectNum) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromSubjects(int index, int subjectNum) {
		if (index >= 0) {
			subjects.remove(index);
			System.out.println("the subject " + subjectNum + "is deleted");
			return 1;
		}
		else {
			System.out.println("the subject has not been registered");
			return -1;
		}
	}
	public void editSubject() {

		System.out.print("과목순번: ");
		int subjectNum = input.nextInt();
		for (int i = 0; i < subjects.size(); i++) {
			SubjectInput subject = subjects.get(i);
		    if (subject.getNum() == subjectNum) {
		    	int num = -1;
		    	while (num != 5) {
		    		showEditMenu();
		    		num = input.nextInt();
		    		switch(num) {
		    		case 1:
		    			((SubjectInput) subjects).setSubjectNum(input);
		    			break;
		    		case 2:
		    			((SubjectInput) subjects).setSubjectName(input);
		    			break;
		    		case 3:
		    			((SubjectInput) subjects).setSubjectProfessor(input);
		    			break;
		    		case 4:
		    			((SubjectInput) subjects).setSubjectClass(input);
		    			break;
		    		default:
		    			continue;
		    		}

				}
		    	break;
			}	
		}
	}
	public void viewSubjects() {
		System.out.println("# of registered subjects:" + subjects.size());
		for (int i = 0; i < subjects.size(); i++) {
			subjects.get(i).printInfo();
		}		

	}
	public int size() {
		return subjects.size();
	}
	public SubjectInput get(int index) {
		return (SubjectInput) subjects.get(index);
	}


	public void showEditMenu() {
		System.out.println("** Subject Info Edit Menu **");    	
		System.out.println(" 1. Edit SubjectNum");							
		System.out.println(" 2. Edit SubjectName");			
		System.out.println(" 3. Edit Professor");
		System.out.println(" 4. Edit SubjectClass");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6:");			
	}

	public void setScanner(Scanner input2) {
		// TODO Auto-generated method stub
		
	}
}
