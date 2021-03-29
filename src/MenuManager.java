import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {			
			System.out.println("1. Add Subject");
			System.out.println("2. Delete Subject");
			System.out.println("3. Edit Subject");
			System.out.println("4. View Subject");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1-6 :");
			num = input. nextInt();
			if (num == 1) {
				addSubject();
			}
			else if (num == 2) {
				deleteSubject();
			}
			else if (num == 3) {
				editSubject();
			}
			else if (num == 4) {
				viewSubject();
			}
			else {
				continue;
			}
		}
		

	}
	public static void addSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("과목: ");
		String subjectName = input.next();
		System.out.print("교수: ");
		String professor = input.next();
		System.out.print("분반: ");
		int subjectClass = input.nextInt();
	}
	public static void deleteSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("과목: ");
		String subjectName = input.next();
		
	}
	public static void editSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("과목: ");
		String subjectName = input.next();
	}
	public static void viewSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("과목: ");
		String subjectName = input.next();
	}
}
