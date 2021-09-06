package simple.fms.ui;


import simple.fms.model.FarmDetails;

import java.text.ParseException;
import java.util.Scanner;

public class FarmAddFarmDetailsUI {

    public static FarmDetails getFarmDetails(){
        Scanner scanner = new Scanner(System.in);
        FarmDetails farmDetails = new FarmDetails();
        System.out.println("Enter the following details:");

        System.out.println("Enter the field ID");
        farmDetails.setFieldId(scanner.nextLine());

        System.out.println("Enter the field name");
        farmDetails.setFieldName(scanner.nextLine());

        System.out.println("Enter the field size");
        farmDetails.setFieldSize(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter the field Status");
        farmDetails.setFieldStatus(scanner.nextLine());


      return farmDetails;
    }
    public static FarmDetails getFieldId() throws ParseException {
        FarmDetails farmDetails = new FarmDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the field id you want to delete");
        farmDetails.setFieldName(scanner.nextLine());
        return farmDetails;
    }
}
