package simple.fms.logic;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface LogicI<T> {
    boolean add(T t) throws ParseException, SQLException;
    List<T> read() throws SQLException, ParseException;
    boolean delete(T t) throws SQLException;
}
