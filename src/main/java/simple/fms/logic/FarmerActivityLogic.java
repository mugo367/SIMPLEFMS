package simple.fms.logic;


import simple.fms.model.Activity;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FarmerActivityLogic  implements LogicI <Activity> {

    @Override
    public boolean add(Activity activity) throws ParseException, SQLException {
        DbUtil dbUtil = new DbUtil();


        String query = "INSERT INTO activity(`activityID` ,`taskName`,`fieldName` ,`startDate` ,`finalDate` ,`description`) VALUES('"+activity.getActivityID()+"','"+activity.getTaskName()+"', '"+activity.getFieldName()+"', " +
                "'"+activity.getStartDate()+"','"+activity.getFinalDate()+"', '"+activity.getDescription()+"')";
        int result = dbUtil.writeData(query);

        return  (result==1);


    }

    @Override
    public List<Activity> read() throws SQLException, ParseException {
        List<Activity> results = new ArrayList<Activity>();
        DbUtil dbUtil = new DbUtil();
        String query="SELECT * FROM activity";

        ResultSet resultSet = dbUtil.readData(query);
        while (resultSet.next()){
            Activity activity = new Activity();
            activity.setActivityID(resultSet.getString(2));
            activity.setTaskName(resultSet.getString(3));
            activity.setFieldName(resultSet.getString(4));
            activity.setStartDate(resultSet.getString(5));
            activity.setFinalDate(resultSet.getString(6));
            activity.setDescription(resultSet.getString(7));
            results.add(activity);
        }
        return results;
    }

    @Override
    public boolean delete(Activity activity) throws SQLException {
        DbUtil dbUtil = new DbUtil();

        String query = "DELETE FROM activity WHERE activityID = '"+activity.getActivityID()+"'";
        int result = dbUtil.writeData(query);

        return  (result==1);

    }
}
