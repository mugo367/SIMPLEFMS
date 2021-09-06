package simple.fms.ui;


import simple.fms.model.Equipment;

import java.text.ParseException;
import java.util.Scanner;

public class FarmerAddEquipmentUI {

    public static Equipment getEquipment(){
        Equipment equipment = new Equipment();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the following details:");

        System.out.println("Enter the equipment label");
        equipment.setEquipmentLabel(scanner.nextLine());

        System.out.println("Enter the equipment name");
        equipment.setCondition(scanner.nextLine());

        System.out.println("Enter the equipment condition");
        equipment.setCondition(scanner.nextLine());

        System.out.println("Enter the equipment quantity");
        equipment.setQuantity(scanner.nextInt());
        scanner.nextLine();
       return equipment;
    }
    public static Equipment getEquipmentLabel() throws ParseException {
        Equipment equipment = new Equipment();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the equipment label you want to delete");
        equipment.setEquipmentLabel(scanner.nextLine());
        return equipment;
    }
}
