package simple.fms.logic;


import simple.fms.model.IncomeExpense;
import simple.fms.model.enumFiles.TransactionType;
import simple.fms.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerIncomeExpenseLogic implements LogicI<IncomeExpense> {
    @Override
    public boolean add(IncomeExpense incomeExpense) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query ="INSERT INTO income (`transactionId`, `transactionDate`, `transactionType`, `transactionCost`, `transactionDetails`) VALUES ('"+incomeExpense.getTransactionId()+"','"+incomeExpense.getTransactionDate()+"'," +
                "'"+incomeExpense.getTransactionType()+"','"+incomeExpense.getTransactionCost()+"', '"+incomeExpense.getTransactionDetails()+"')";
        int result = dbUtil.writeData(query);

        return  (result==1);

    }

    @Override
    public List<IncomeExpense> read() throws SQLException {
        DbUtil dbUtil = new DbUtil();
        List<IncomeExpense> results= new ArrayList<IncomeExpense>();

        String query = "SELECT * FROM income";
        ResultSet resultSet = dbUtil.readData(query);
        while (resultSet.next()){
            IncomeExpense incomeExpense = new IncomeExpense();
            incomeExpense.setTransactionId(resultSet.getString(2));
            incomeExpense.setTransactionDate(resultSet.getString(3));
            incomeExpense.setTransactionType(TransactionType.valueOf(resultSet.getString(4)));
            incomeExpense.setTransactionCost(resultSet.getInt(5));
            incomeExpense.setTransactionDetails(resultSet.getString(6));
            results.add(incomeExpense);
        }
        return results;
    }

    @Override
    public boolean delete(IncomeExpense incomeExpense) throws SQLException {
        DbUtil dbUtil = new DbUtil();
        String query = "DELETE FROM income WHERE transactionId = '"+incomeExpense.getTransactionId()+"'";
        int result = dbUtil.writeData(query);
        return (result == 1);
    }
}
