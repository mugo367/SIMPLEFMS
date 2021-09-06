package simple.fms.logic;


import simple.fms.model.Employee;
import simple.fms.model.enumFiles.Gender;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerEmployeeLogic implements LogicI<Employee> {
    @Override
    public boolean add(Employee employee) throws SQLException {
        DbUtil dbUtil = new DbUtil();

        String query = "INSERT INTO employee (`employeeNumber` ,`employeeName`,`dateOfEmp` ,`gender`,`email` ,`contact` ,`emergencyContact`) VALUES(" +
                "'"+employee.getEmployeeNumber()+"','"+employee.getEmployeeName()+"','"+employee.getDateOfEmp()+"', '"+employee.getGender()+"', " +
                "'"+employee.getEmail()+"'" + "'"+employee.getContact()+"', '"+employee.getEmergencyContact()+"')";

        int result = dbUtil.writeData(query);

        return  (result==1);
    }

    @Override
    public List<Employee> read() throws SQLException {
        DbUtil dbUtil = new DbUtil();

        List<Employee> results= new ArrayList<Employee>();
        String query="SELECT * FROM employee";

        ResultSet resultSet = dbUtil.readData(query);
        while (resultSet.next()){
            Employee employee = new Employee();
            employee.setEmployeeNumber(resultSet.getString(2));
            employee.setEmployeeName(resultSet.getString(3));
            employee.setDateOfEmp(resultSet.getString(4));
            employee.setGender(Gender.valueOf(resultSet.getString(5)));
            employee.setEmail(resultSet.getString(6));
            employee.setContact(resultSet.getString(7));
            employee.setEmergencyContact(resultSet.getString(8));
            results.add(employee);
        }
        return results;
    }

    @Override
    public boolean delete(Employee employee) throws SQLException {
        DbUtil dbUtil = new DbUtil();

        String query = "DELETE FROM activity WHERE activityID = '"+employee.getEmployeeNumber()+"'";
        int result = dbUtil.writeData(query);

        return  (result==1);

    }
}
