package simple.fms.logic;


import simple.fms.model.Equipment;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerEquipmentLogic implements LogicI<Equipment> {
    @Override
    public boolean add(Equipment equipment) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query ="INSERT INTO equipment (`equipmentLabel`, `name` ,`condition` ,`quantity`) VALUES ('"+equipment.getEquipmentLabel()+"','"+equipment.getName()+"'," +
                "'"+equipment.getCondition()+"', '"+equipment.getQuantity()+"')";
        int result = dbUtil.writeData(query);

        return  (result==1);

    }

    @Override
    public List<Equipment> read() throws SQLException {
        DbUtil dbUtil = new DbUtil();

        List<Equipment> results= new ArrayList<Equipment>();
        String query = "SELECT * FROM equipment";
        ResultSet resultSet = dbUtil.readData(query);

        while (resultSet.next()){
            Equipment equipment = new Equipment();
            equipment.setEquipmentLabel(resultSet.getString(2));
            equipment.setName(resultSet.getString(3));
            equipment.setCondition(resultSet.getString(4));
            equipment.setQuantity(resultSet.getInt(5));
            results.add(equipment);
        }
        return results;
    }

    @Override
    public boolean delete(Equipment equipment) throws SQLException {
        DbUtil dbUtil = new DbUtil();

        String query = "DELETE FROM equipment WHERE equipmentLabel = '"+equipment.getEquipmentLabel()+"'";
        int result = dbUtil.writeData(query);

        return  (result==1);
    }
}
