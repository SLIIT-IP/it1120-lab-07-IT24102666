import java.util.Scanner;

public class IT24102666Lab7Q1A {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

			System.out.println("Enter marks for four subjects:");
			int[] Marks = new int [4];

			int Totalmarks = 0;

			for (int i = 0; i < 4; i++) {
			System.out.print("Enter Subject Mark " + (i + 1) + " : "); 
			Marks[i] = scanner.nextInt();
			Totalmarks += Marks[i];
			}

			double Average = Totalmarks / 4.0;
			System.out.println("Average is: " + Average);

			String Grade;

			if (Average >= 75 && Average <= 100) {
			Grade = "Distinction";

			} else if (Average >= 50 && Average < 75) {
			Grade = "Credit";

			} else if (Average >= 0 && Average < 50) {
			Grade = "Fail";
			
			} else { 
			Grade = "Invalid Marks";
			
			}
			
			System.out.println("Overall Grade is: " + Grade);
			scanner.close();

			}
		}
