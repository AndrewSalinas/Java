//Andrew Salinas, 12/15/18, 4:00AM, Plz End my life
import java.util.Scanner;

public class IRS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a filling status: 1 for Single or 2 for Married");
        int status = input.nextInt();


        System.out.println("Please enter your monthly taxable income");
            //Determines the values based off user response
        double income = input.nextInt();
        double tax = findTax(status, income);


        System.out.println("Filing Status " + status + "\n" + "Taxable income: %9.2f" + "\n" + "Federal tax: %12.2f" + income + tax);
        System.exit(0);
    }




    public static double findTax(int status, double income) {
        double findTax = 0;


        if (status == 1) {
            if (income <= 27050)
                findTax = (income * .15);
            //This method calculates single citizens
            else if (income <= 65550)
                findTax = (4057 + (income - 27050) * .275);

            else if (income <= 136750)
                findTax = (14645.0 + (income - 65550) * .305);

            else if (income <= 297350)
                findTax = (36361 + (income - 136750) * .355);

            else findTax = (93374 + (income - 297350) * .391);
        }




        if (status == 2){
            if (income <= 45200)
                findTax = (income * .15);

            else if (income < 109250)
                findTax = (6780.0 + (income - 45200) * .275);

            else if (income <= 166500)
                findTax = (24393.75 + (income - 109205) * .305);

            //Calculates the unfortunate souls of the Married: RIP

            else if (income <= 297350)
                findTax = (41855 + (income - 166500) * .355);

            else findTax = (88306 + (income - 297350) * .391);
        }

        return findTax;

    }

}


