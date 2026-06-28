import java.util.*;
import java.io.IOException;
class Budget{
    
}
public class PersonalFinanceBudgetTracker {

    public static void main(String args[])throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("    PERSONAL FINANCE & BUDGET TRACKER    ");
        System.out.println("==========================================");

        // User Information Input

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Monthly Salary (/-): ");
        int salary = sc.nextInt();

        // Registration Status

        System.out.println();
        System.out.println("Registration Successful!");
        System.out.println();
        System.out.println("Press Enter to Continue...");
        int enter=System.in.read();
        
         

        //some variables inside cases are not accessble in other case so lets declare here
        int foodExpense = 0;
        int transportExpense = 0;
        int entertainmentExpenses = 0;
        int billsExpense = 0;
        int otherExpense = 0;
        int remainingBalance=0;
        int totalExpenses=0;

        // User Choice

        byte choice = 0;

        while (choice != 4) {

            // Main Menu

            System.out.println("==========================================");
            System.out.println("                 MAIN MENU                 ");
            System.out.println("===========================================");
            System.out.println();

            System.out.println(
                    "1. Add Expenses\n" +
                    "2. View Financial Report\n" +
                    "3. Check Savings Goal\n" +
                    "4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextByte();

            switch (choice) {

                // Case 1 : Expense Entry

                case 1:

                    System.out.println("==========================================");
                    System.out.println("                 EXPENSE ENTRY                 ");
                    System.out.println("===========================================");
                    System.out.println();

                    // Expense Inputs

                    System.out.print("Enter Food Expense (/-): ");
                     foodExpense = sc.nextInt();

                    System.out.print("Enter Transport Expense (/-): ");
                     transportExpense = sc.nextInt();

                    System.out.print("Enter Entertainment Expense (/-): ");
                     entertainmentExpenses = sc.nextInt();

                    System.out.print("Enter Bills Expense (/-): ");
                     billsExpense = sc.nextInt();

                    System.out.print("Enter Other Expense (/-): ");
                     otherExpense = sc.nextInt();

                    System.out.println();
                    System.out.println("Expenses Recorded Successfully!");
                    System.out.println();
                    System.out.println("Press Enter to Continue...");
                    enter=System.in.read();
                    totalExpenses = foodExpense + transportExpense + entertainmentExpenses + billsExpense + otherExpense;
                   

                    break;

                // Case 2 : Financial Report

                case 2:

                    System.out.println("==========================================");
                    System.out.println("             FINANCIAL REPORT             ");
                    System.out.println("===========================================");
                    System.out.println();

                    // User Details

                    System.out.println("User Details");
                    System.out.println("---------------------------");
                    System.out.println("Name         :" + name);
                    System.out.println("Age          :" + age);
                    System.out.println("Monthly Salary:" + salary);
                    System.out.println();

                    // Expense Details

                    System.out.println("Expense Details");
                    System.out.println("---------------------------");
                    System.out.println("Food               :" + foodExpense);
                    System.out.println("Transport          :" + transportExpense);
                    System.out.println("Entertainment      :" + entertainmentExpenses);
                    System.out.println("Bills              :" + billsExpense);
                    System.out.println("Others             :" + otherExpense);
                    System.out.println();

                    // Financial Summary

                    System.out.println("Financial Summary");
                    System.out.println("----------------------------");

                    

                    System.out.println("Total Expenses     : (/-)" + totalExpenses);

                    remainingBalance = salary - totalExpenses;
                    System.out.println("Remaining Balance  : (/-)" + remainingBalance);

                    float savingPercentage = ((float)remainingBalance/salary)*100;
                    System.out.println("Savings Percentage :" + savingPercentage);
                    System.out.println();

                    // Budget Analysis

                    System.out.println("Budget Analysis");
                    System.out.println("----------------------------");
                    System.out.print("Budget Health      :");

                    if (savingPercentage >= 40) {
                        System.out.println("Excellent");
                    } else if (savingPercentage >= 25) {
                        System.out.println("Good");
                    } else if (savingPercentage >= 10) {
                        System.out.println("Average");
                    }else {
                        System.out.println("Poor");
                    }

                    // Emergency Fund Status

                    System.out.println("Emergency Fund Status");
                    System.out.println("----------------------------");

                    if (salary > 30000 && savingPercentage > 20) {
                        System.out.println("Eligible");
                    } else {
                        System.out.println("Not Eligible");
                    }

                    System.out.println();

                    // Performance Message

                    System.out.println("Performance Message");
                    System.out.println("----------------------------");

                    if (savingPercentage >= 50) {
                        System.out.println("Excellent Financial Discipline!");
                    } else if (savingPercentage >= 30) {
                        System.out.println("Good Financial Management!");
                    } else if (savingPercentage >= 15) {
                        System.out.println("Average Spending Habits!");
                    } else {
                        System.out.println("Needs Better Budget Planning!");
                    }

                    System.out.println("Press Enter to Continue...");
                    enter=System.in.read();
                     
                    

                    break;

                // Case 3 : Savings Goal Tracker

                case 3:

                    System.out.println("==========================================");
                    System.out.println("          SAVINGS GOAL TRACKER            ");
                    System.out.println("===========================================");

                    System.out.print("Enter Desired Savings Goal (/-):");
                    int desiredGoal = sc.nextInt();
                    System.out.println("Monthly Savings: " + remainingBalance);
                    System.out.println("Progress");
                    int currentBalance=remainingBalance;
                    for (int i = 1; i <= 12; i++) {

                        System.out.println("Month "+ i +"-> (/-)"+ currentBalance);

                        if (currentBalance >= desiredGoal) {
                            System.out.println("Congratulations!");
                            System.out.println("You will reach your goal in " + i + " months");
                            break;
                        } else {
                            currentBalance +=(salary-totalExpenses);
                        }
                    }

                    System.out.print("Press Enter to Continue...");
                    enter=System.in.read();
                 

                    break;

                // Case 4 : Exit

                case 4:

                    System.out.println(
                            "Thank You For Using Personal Finance Tracker! Program Terminated Successfully.");

                    break;
            }
        }
    }
}
