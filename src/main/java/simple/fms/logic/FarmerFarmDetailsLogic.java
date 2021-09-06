package simple.fms.logic;

import simple.fms.model.FarmDetails;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerFarmDetailsLogic implements LogicI<FarmDetails> {
    @Override
    public boolean add(FarmDetails farmDetails) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query = "INSERT INTO farmdetails (`fieldId` ,`fieldName`, `fieldSize` ,`fieldStatus`) VALUES('"+farmDetails.getFieldId()+"'," +
               "'"+farmDetails.getFieldName()+"', '"+farmDetails.getFieldSize()+"' , '"+farmDetails.getFieldStatus()+"')";
        int result = dbUtil.writeData(query);

        return  (result==1);
    }

    @Override
    public List<FarmDetails> read() throws SQLException {
        DbUtil dbUtil = new DbUtil();

        List<FarmDetails> results= new ArrayList<FarmDetails>();
        String query = "SELECT * FROM farmdetails";
        ResultSet resultSet = dbUtil.readData(query);
        while (resultSet.next()){
            FarmDetails farmDetails = new FarmDetails();
            farmDetails.setFieldId(resultSet.getString(2));
            farmDetails.setFieldName(resultSet.getString(3));
            farmDetails.setFieldSize(resultSet.getInt(4));
            farmDetails.setFieldStatus(resultSet.getString(5));
            results.add(farmDetails);
        }
        return results;
    }

    @Override
    public boolean delete(FarmDetails farmDetails) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query = "DELETE FROM farmdetails WHERE fieldName = '"+farmDetails.getFieldName()+"'";
        int result = dbUtil.writeData(query);

        return  (result==1);
    }
}
