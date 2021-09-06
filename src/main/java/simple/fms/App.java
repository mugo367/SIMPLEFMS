package simple.fms;

import simple.fms.ui.FarmerUI;

import java.sql.SQLException;
import java.text.ParseException;

public class App
{
    public static void main(String[] args) throws SQLException, ParseException {
        // write your code here
        FarmerUI farmerUI = new FarmerUI();
        farmerUI.homePage();
    }
}
