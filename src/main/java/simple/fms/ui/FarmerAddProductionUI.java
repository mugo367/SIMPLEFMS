package simple.fms.ui;

import simple.fms.model.Production;

import java.text.ParseException;
import java.util.Scanner;

public class FarmerAddProductionUI {

    public static Production getProduction() throws ParseException {
        Production production = new Production();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the following details:");
        System.out.println("Enter production label");
        production.setProductionLabel(scanner.nextLine());

        System.out.println("Enter crop harvested");
        production.setCrop(scanner.nextLine());

        System.out.println("Enter harvest date (dd-MM-yyyy)");
        production.setProductionDate(scanner.nextLine());

        System.out.println("Enter field name");
        production.setFieldName(scanner.nextLine());

        System.out.println("Enter quantity produced");
        production.setProductionQuantity(scanner.nextLine());

        return production;
    }
    public static Production getProductionLabel() throws ParseException {
        Production production = new Production();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter production label to delete");
        production.setProductionLabel(scanner.nextLine());
        return production;
    }
}
