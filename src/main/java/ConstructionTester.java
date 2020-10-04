import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        double taxRate;
        int lumbers;
        int windows;
        double total;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.println("How many boards do you need? ");
        lumbers = scanner.nextInt();
        System.out.println("How many windows do you need? ");
        windows = scanner.nextInt();

        Construction myConstruction = new Construction(8.0, 11.0, taxRate);
       int total = myConstruction.lumberCost(lumbers) + myConstruction.windowCost(windows);
       int granTotal = myConstruction.granTotal(total);
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + granTotal);
    }
}
