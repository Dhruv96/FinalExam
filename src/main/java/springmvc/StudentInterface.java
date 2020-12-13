package springmvc;

import java.sql.SQLException;
import java.util.List;

interface StudentInterface {
     List<StudentData> display() throws ClassNotFoundException, SQLException;
     void update(String id,String sname, Double gpa) throws ClassNotFoundException, SQLException;
     void delete(String id) throws ClassNotFoundException, SQLException;
}
