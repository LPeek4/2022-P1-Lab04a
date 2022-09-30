// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;

        double numMonths  = numYears * 12;
        double monthlyRate = ((annualRate/100) / 12);

        double monthPayTop = monthlyRate * (Math.pow ((1+monthlyRate),numMonths));
        double monthPayBottom = (Math.pow ((1+monthlyRate),numMonths)) - 1;
        double monthPay = ((monthPayTop / monthPayBottom) * principal);
        double monthPayRound = (Math.ceil(monthPay * 100)) / 100;

        double TotalPay = monthPayRound * numMonths;

        double TotalInt = TotalPay - principal;

        System.out.println("Principle:         $" + principal);
        System.out.println("Annual Rate:       " + annualRate + "%");
        System.out.println("Number of Years:   " + numYears);
        System.out.println("Monthly Payment:   $" + monthPayRound);
        System.out.println("Total Payments:    $" + TotalPay);
        System.out.println("Total Interest:    $" + TotalInt);

    }
}

