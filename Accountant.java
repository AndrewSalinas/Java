import java.util.Scanner;

public class Accountant extends IRS {   //Just sum printy bois

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your relationship filing status: 1 if Non-Married or 2 if Married");
        int status = input.nextInt();

        System.out.println("Enter your monthly taxable income");

        double income = input.nextInt();
        double tax = findTax(status, income);

        System.out.println("Filing Status" + status + "\n" + "Taxable income: %9.2f" + "\n" + "Federal tax: %12.2f" + income + tax);
        System.exit(0);
    }
}
