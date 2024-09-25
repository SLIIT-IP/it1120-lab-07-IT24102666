import java.util.Scanner;

public class IT24102666Lab7Q1B {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		for (int i = 1; i <= 3; i++) {
		System.out.println("Student " + i);

		int Marks1 = scanner.nextInt();
		int Marks2 = scanner.nextInt();
		int Marks3 = scanner.nextInt();
		int Marks4 = scanner.nextInt();
		
		System.out.println("Enter Marks: " + Marks1 + " " + Marks2 + " " + Marks3 + " " + Marks4);

		double Average = (Marks1 + Marks2 + Marks3 + Marks4) / 4.0;
		System.out.println("Average is : " + Average);

		String Grade;
			if (Average >= 75 && Average <= 100) {
			Grade = "Distinction";

			} else if (Average >=50 && Average < 75) {
			Grade = "Credit";

			} else {
			Grade = "Fail";
			}

			System.out.println("Overall Grade is : " + Grade);
		}

			scanner.close();

		
	}	
}
