package simple.fms.logic;


import simple.fms.model.Production;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerProductionLogic implements LogicI<Production> {
    @Override
    public boolean add(Production production) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query = "INSERT INTO production (`productionLabel`, `crop`, `productionDate`, `fieldName`, `productionQuantity`) " +
                "VALUES ('"+production.getProductionLabel()+"','"+production.getCrop()+"','"+production.getProductionDate()+"', " +
                "'"+production.getFieldName()+"', '"+production.getProductionQuantity()+"')";

        int result = dbUtil.writeData(query);
        return  (result==1);
    }

    @Override
    public List<Production> read() throws SQLException {
        DbUtil dbUtil = new DbUtil();
        List <Production> results= new ArrayList<Production>();
        String query = "SELECT * FROM production";
        ResultSet resultSet = dbUtil.readData(query);
        while (resultSet.next()){
            Production production = new Production();
            production.setProductionLabel(resultSet.getString(2));
            production.setCrop(resultSet.getString(3));
            production.setProductionDate(resultSet.getString(4));
            production.setFieldName(resultSet.getString(5));
            production.setFieldName(resultSet.getString(6));
            results.add(production);
        }
        return results;
    }

    @Override
    public boolean delete(Production production) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query = "DELETE FROM production WHERE productionLabel = '"+production.getProductionLabel()+"'";
        int result = dbUtil.writeData(query);

        return (result == 1);
    }
}
