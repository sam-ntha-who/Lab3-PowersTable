import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		String response;
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter an integer:");

			int num = scnr.nextInt();
			// formulae
			int square = num * num;
			int cube = num * num * num;
			int i = 1;
			// table
			System.out.printf("%-10s %-11s %-10s", "NUMBER", "SQUARED", "CUBED");
			System.out.println();
			System.out.printf("%-10s %-11s %-10s", "======", "=======", "=====");
			System.out.println();
			// fill in the table
			for (i = 1; i < num; i++) {
				
				System.out.printf("%-10d %-11d %-10d", i, (i * i), (i * i * i));
				System.out.println();
			}
			
			System.out.printf("%-10d %-11d %-10d", num, square, cube);
			System.out.println();
			// feed computer more numbers
			System.out.println("Would you like to continue? Y/N");
			response = scnr.next();
		} while (response.equalsIgnoreCase("Y"));
		scnr.close();

	}
}
