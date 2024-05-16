import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Input 
        double amountUsd = 0;

        // Hardcoded exchange rates
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.72;
        double usdToJpyRate = 109.35;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        // WHILE Loop, If number does not equal -99
        while (amountUsd != -99) {
            System.out.println("Enter amount in USD - enter -99 when done");
            amountUsd = scanner.nextDouble();
            scanner.nextLine();

             // IF Loop, if number does equal 99
            if (amountUsd == -99){
                System.out.println("Goodbye!");
            	scanner.close();
			} // End of IF

			else {
				System.out.println("Choose currency to convert to:");
                System.out.println("1. EUR" + "\n" + "2. GBP" + "\n" + "3. JPY");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                double convertedAmount;
                switch (choice) {
                    case 1:
                        convertedAmount = amountUsd * usdToEurRate;
                        System.out.println(amountUsd + " USD = " + convertedAmount + " EUR");
                    break;
                    case 2:
                        convertedAmount = amountUsd * usdToGbpRate;
                        System.out.println(amountUsd + " USD = " + convertedAmount + " GBP");
                    break;
                    case 3:
                        convertedAmount = amountUsd * usdToJpyRate;
                        System.out.println(amountUsd + " USD = " + convertedAmount + " JPY");
                    break;
                default:
                    System.out.println("Invalid choice");
                }

			} // End of Else

        } // End of While
    }
}
