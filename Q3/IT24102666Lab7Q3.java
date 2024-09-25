import java.util.Scanner;

public class IT24102666Lab7Q3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final double DISCOUNT_RATE = 0.05;

		for (int i = 1; i <= 5; i++) {
		System.out.println("Customer " + i);

            	System.out.print("Enter total bill amount: ");

           	double TotalBill = scanner.nextDouble();

		System.out.print("Enter mode of payment (C for Cash, O for other): ");
            	char Paymentmode = scanner.next().charAt(0);

                double Discount = TotalBill * DISCOUNT_RATE;
                double Amounttopay = TotalBill - Discount;

		if (Paymentmode == 'C' || Paymentmode == 'c') {

		System.out.println("Discount is: " + Discount);
		System.out.println("Amount to be paid: " + Amounttopay);

		} else if (Paymentmode == 'O' || Paymentmode == 'o') {

		System.out.println("No Discount Applicable");
		System.out.println("Amount to be paid: " + TotalBill);
		
		} else {
		System.out.println("Payment Mode is Not Valid");
		}
		}
		scanner.close();
}
}
