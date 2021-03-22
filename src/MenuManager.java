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
			
			switch (num) {
			
			case 1:
				System.out.print("과목명 : ");
				String subjectname = input.next();
				System.out.print("분반 : ");
				int subjectclass = input.nextInt();
				break;
			case 2:
				System.out.print("과목명 : ");
				String subjectname2 = input.next();
				break;
			case 3:
				System.out.print("과목명 : ");
				String subjectname3 = input.next();
				break;
			case 4:
				System.out.print("과목명 : ");
				String subjectname4 = input.next();
				break;
			case 5:
				break;

			}
		}
		

	}

}
