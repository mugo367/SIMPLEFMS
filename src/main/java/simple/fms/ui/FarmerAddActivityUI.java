package simple.fms.ui;


import simple.fms.model.Activity;

import java.text.ParseException;
import java.util.Scanner;

public class FarmerAddActivityUI {

    public static Activity getActivity() throws ParseException {
        Activity activity = new Activity();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the following details:");
        System.out.println("Enter activity id");
        activity.setActivityID(scanner.nextLine());

        System.out.println("Enter activity Name");
        activity.setTaskName(scanner.nextLine());

        System.out.println("Enter field Name");
        activity.setFieldName(scanner.nextLine());

        System.out.println("Enter start date (dd-MM-yyyy)");
        activity.setStartDate(scanner.nextLine());

        System.out.println("Enter end date (dd-MM-yyyy)");
        activity.setFinalDate(scanner.nextLine());

        System.out.println("Enter activity details");
        activity.setDescription(scanner.nextLine());

        return activity;

    }
    public static Activity getActivityId() throws ParseException {
        Activity activity = new Activity();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the activity ID you want to delete");

        activity.setActivityID(scanner.nextLine());
        return activity;
    }

}
