package simple.fms.ui;


import simple.fms.model.IncomeExpense;
import simple.fms.model.enumFiles.TransactionType;

import java.text.ParseException;
import java.util.Scanner;

public class FarmerAddIncomeExpenseUI {


    public static IncomeExpense getTransactionDetail() throws ParseException {
        IncomeExpense incomeExpense = new IncomeExpense();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the following details:");
        System.out.println("Enter transaction id");
        incomeExpense.setTransactionId(scanner.nextLine());

        System.out.println("Enter transaction date (dd-MM-yyyy)");
        incomeExpense.setTransactionDate(scanner.nextLine());

        System.out.println("Enter Transaction Type(Income or Expense)");
        incomeExpense.setTransactionType(TransactionType.valueOf(scanner.nextLine()));

        System.out.println("Enter transaction cost");
        incomeExpense.setTransactionCost(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter transaction details");
        incomeExpense.setTransactionDetails(scanner.nextLine());

        return incomeExpense;

    }
    public static IncomeExpense getTransactionId() throws ParseException {
        IncomeExpense incomeExpense = new IncomeExpense();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter transaction id of the transaction to delete");
        incomeExpense.setTransactionId(scanner.nextLine());
        return incomeExpense;
    }
}
