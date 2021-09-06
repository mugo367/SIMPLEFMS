package simple.fms.ui;


import simple.fms.logic.*;
import simple.fms.model.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;


public class FarmerUI {
     public static void homePage() throws SQLException, ParseException {
         Scanner scanner = new Scanner(System.in);
         mainPage(scanner);
     }

    private static void mainPage(Scanner scanner) throws SQLException, ParseException {
        int option;
        do{
            System.out.println("Welcome to Farm Management System\n");
            System.out.println("Please select an option : \n" +
                "1. Farm Records\n" +
                "2. Farm Planner \n" +
                "3. Farm Statistics\n" +
                "4. Exit App\n" );
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    farmRecords(scanner);
                    break;
                case 2:
                    farmPlanner(scanner);
                    break;
                case 3:
                    farmStatistics(scanner);
                    break;
                case 4:
                    System.out.println("Exiting Farm Management System:)");
                    System.out.println("===============================================");
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected Option: " + option);
            }
        }while(option!=4);
    }

    private static void farmStatistics(Scanner scanner) throws SQLException, ParseException {
        int selection;
        do{
            System.out.println("Record and View Farm statistics");
            System.out.println("Please select an option : \n" +
                    "1. Production Records\n" +
                    "2. Income/Expense Records\n"+
                    "0. BACK");
            selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection){
                case 1:
                    int op;
                    Production production;
                    FarmerProductionLogic farmerProductionLogic = new FarmerProductionLogic();
                    System.out.println("Record and Track your Production Records\n");
                    System.out.println("Please select an option : \n" +
                            "1. Add Production Record \n" +
                            "2. View Production Record \n" +
                            "3. Delete Production Record\n" );
                    op = scanner.nextInt();
                    scanner.nextLine();
                    //===================================================
                    if(op == 1){
                        System.out.println("Add Production Record");
                        production = FarmerAddProductionUI.getProduction();
                        boolean result = farmerProductionLogic.add(production);
                        if(result){
                            System.out.println("Record Was added successfully");
                        }else {
                            System.out.println("Record Was not added");
                        }
                    }
                    //===================================================
                    if(op == 2){
                        System.out.println("View Production Record");
                        List<Production> productionList = farmerProductionLogic.read();
                        for(Production production1 : productionList){
                            System.out.println(production1);
                        }
                    }
                    //===================================================
                    if(op == 3){
                        System.out.println("Delete Production Record");
                        production = FarmerAddProductionUI.getProductionLabel();
                        boolean result = farmerProductionLogic.delete( production);
                        if(result){
                            System.out.println("Record Was deleted successfully");
                        }else {
                            System.out.println("Record Was not deleted check ID");
                        }
                    }
                    break;
                case 2:
                    IncomeExpense incomeExpense;
                    FarmerIncomeExpenseLogic farmerIncomeExpenseLogic = new FarmerIncomeExpenseLogic();
                    System.out.println("Record and Track your transaction Records\n");
                    System.out.println("Please select an option : \n" +
                            "1. Add Income/Expense Record \n" +
                            "2. View Income/Expense Record \n" +
                            "3. Delete Income/Expense Record\n" );
                    op = scanner.nextInt();
                    scanner.nextLine();
                    //===================================================
                    if(op == 1){
                        System.out.println("Add Income/Expense Record");
                        incomeExpense = FarmerAddIncomeExpenseUI.getTransactionDetail();
                        boolean result = farmerIncomeExpenseLogic.add(incomeExpense);
                        if(result){
                            System.out.println("Record Was added successfully");
                        }else {
                            System.out.println("Record Was not added");
                        }
                    }
                    //===================================================
                    if(op == 2){
                        System.out.println("View Income/Expense Record");
                        List<IncomeExpense> incomeExpenses = farmerIncomeExpenseLogic.read();
                        for(IncomeExpense incomeExpense1 : incomeExpenses){
                            System.out.println(incomeExpense1);
                        }
                    }
                    //===================================================
                    if(op == 3){
                        System.out.println("Delete Income/Expense Record");

                        incomeExpense = FarmerAddIncomeExpenseUI.getTransactionId();
                        boolean result = farmerIncomeExpenseLogic.delete( incomeExpense);
                        if(result){
                            System.out.println("Record Was deleted successfully");
                        }else {
                            System.out.println("Record Was not deleted check ID");
                        }
                    }
                    break;
                case 0:
                    mainPage(scanner);
                    break;
                default:
                    throw new IllegalStateException("Unexpected Option: " + selection);
            }

        }while (selection == 0);

    }

    private static void farmPlanner(Scanner scanner) throws ParseException, SQLException {
        int selection;
        Activity activity;
        FarmerActivityLogic farmerActivityLogic = new FarmerActivityLogic();

        System.out.println("Record and Track your Farm Tasks\n");
        System.out.println("Please select an option : \n" +
                "1. Add Farm Activity \n" +
                "2. View Farm Activity \n" +
                "3. Delete Farm Activity\n" );
        selection = scanner.nextInt();
        scanner.nextLine();
        //===================================================
        if(selection == 1){
            System.out.println("Add Farm Activity");
            activity = FarmerAddActivityUI.getActivity();
            boolean result = farmerActivityLogic.add( activity);
            if(result){
                System.out.println("Record Was added successfully");
            }else {
                System.out.println("Record Was not added");
            }
        }
        //===================================================
        if(selection == 2){
            List<Activity> activities = farmerActivityLogic.read();
            for(Activity activity1: activities){
                System.out.println(activity1);
            }
        }
        //===================================================
        if(selection == 3){
            System.out.println("Delete Farm Activity");
            activity = FarmerAddActivityUI.getActivityId();
            boolean result = farmerActivityLogic.delete( activity);
            if(result){
                System.out.println("Record Was deleted successfully");
            }else {
                System.out.println("Record Was not deleted check ID");
            }
        }
    }

    private static void farmRecords(Scanner scanner) throws SQLException, ParseException {
        int choice;
        do{
            System.out.println("Add Farm Records\n(Employee Details, Equipment Details, Farm Details)");
            System.out.println("Please select an option : \n" +
                    "1. Employee Records\n" +
                    "2. Equipment Records \n" +
                    "3. Farm details\n" +
                    "4. Exit \n" );
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    int selection;
                    Employee employee;
                    FarmerEmployeeLogic farmerEmployeeLogic = new FarmerEmployeeLogic();
                    System.out.println("Employee Records\n");
                    System.out.println("Please select an option : \n" +
                            "1. Add Employee \n" +
                            "2. View Employees \n" +
                            "3. Delete Employee details\n" +
                            "4. Exit \n" );
                    selection = scanner.nextInt();
                    scanner.nextLine();
                    //===================================================
                    if(selection == 1){
                        System.out.println("Add Employee Details");
                        employee = FarmerAddEmployeeUI.getEmployee();
                        boolean result = farmerEmployeeLogic.add( employee);
                        if(result){
                            System.out.println("Record Was added successfully");
                        }else {
                            System.out.println("Record Was not added");
                        }
                    }
                    //===================================================
                    if(selection == 2){
                        System.out.println("View Employee Details");
                        List<Employee> employees = farmerEmployeeLogic.read();
                        for(Employee employee1: employees){
                            System.out.println(employee1);
                        }
                    }
                    //===================================================
                    if(selection == 3){
                        System.out.println("Delete Employee Details");

                        employee = FarmerAddEmployeeUI.getEmployeeNumber();
                        boolean result = farmerEmployeeLogic.delete( employee);
                        if(result){
                            System.out.println("Record Was deleted successfully");
                        }else {
                            System.out.println("Record Was not deleted check ID");
                        }
                    }
                    break;
                case 2:
                    Equipment equipment;
                    FarmerEquipmentLogic farmerEquipmentLogic = new FarmerEquipmentLogic();
                    System.out.println("Equipment Records\n");
                    System.out.println("Please select an option : \n" +
                            "1. Add Equipment \n" +
                            "2. View Equipment \n" +
                            "3. Delete Equipment details\n");
                    selection = scanner.nextInt();
                    scanner.nextLine();
                    //===================================================
                    if(selection == 1){
                        System.out.println("Add Equipment Details");
                        equipment= FarmerAddEquipmentUI.getEquipment();
                        boolean result = farmerEquipmentLogic.add(equipment);
                        if(result){
                            System.out.println("Record Was added successfully");
                        }else{
                            System.out.println("Record Was not added");
                        }
                    }
                    //===================================================
                    if(selection == 2){
                        System.out.println("View Equipment Details");
                        List<Equipment> equipments = farmerEquipmentLogic.read();
                        for(Equipment equipment1: equipments){
                            System.out.println(equipment1);
                        }
                    }
                    //===================================================
                    if(selection == 3){
                        System.out.println("Delete Equipment Details");
                        equipment = FarmerAddEquipmentUI.getEquipmentLabel();
                        boolean result = farmerEquipmentLogic.delete( equipment);
                        if(result){
                            System.out.println("Record Was deleted successfully");
                        }else {
                            System.out.println("Record Was not deleted check ID");
                        }
                    }
                    break;
                case 3:
                    FarmDetails farmDetails;
                    FarmerFarmDetailsLogic farmerFarmDetailsLogic = new FarmerFarmDetailsLogic();

                    System.out.println("Farm Details\n");
                    System.out.println("Please select an option : \n" +
                            "1. Add Farm Details \n" +
                            "2. View Farm Details \n" +
                            "3. Delete Farm Details\n");
                    selection = scanner.nextInt();
                    scanner.nextLine();
                    //===================================================
                    if(selection == 1){
                        System.out.println("Add Farm Details");
                        farmDetails = FarmAddFarmDetailsUI.getFarmDetails();
                        boolean results = farmerFarmDetailsLogic.add(farmDetails);
                        if(results){
                            System.out.println("Record Was added successfully");
                        }else {
                            System.out.println("Record Was not added");
                        }
                    }
                    //===================================================
                    if(selection == 2){
                        System.out.println("View Farm Details");
                        List<FarmDetails> farmDetailsList = farmerFarmDetailsLogic.read();
                        for(FarmDetails farmDetails1: farmDetailsList){
                            System.out.println(farmDetails1);
                        }
                    }
                    //===================================================
                    if(selection == 3){
                        System.out.println("Delete Farm Details");

                        farmDetails = FarmAddFarmDetailsUI.getFieldId();
                        boolean result = farmerFarmDetailsLogic.delete( farmDetails);
                        if(result){
                            System.out.println("Record Was deleted successfully");
                        }else {
                            System.out.println("Record Was not deleted check ID");
                        }
                    }
                    break;
                case 4:
                    mainPage(scanner);
                    break;
                default:
                    throw new IllegalStateException("Unexpected Option: " + choice);
            }
        }while(choice!=4);
    }
}
