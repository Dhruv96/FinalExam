package springmvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentInterface {
    @Override
    public List<StudentData> display() throws ClassNotFoundException, SQLException {
        List<StudentData> students = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
        PreparedStatement preparedStatement = con1.prepareStatement("select * from studentrecord");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            String snumber = resultSet.getString(1);
            String sname = resultSet.getString(2);
            Double gpa = resultSet.getDouble(3);
            StudentData student = new StudentData(snumber, sname, gpa);
            students.add(student);
        }
        return students;
    }

    @Override
    public void update(String id, String sname, Double gpa) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
        PreparedStatement preparedStatement = con1.prepareStatement("update studentrecord set sname = ?, gpa = ?" +
                "where snumber=?");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2, sname);
        preparedStatement.setDouble(3, gpa);
        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
        PreparedStatement preparedStatement = con1.prepareStatement("delete from studentrecord where snumber = ?");
        preparedStatement.setString(1,id);
        preparedStatement.executeUpdate();
    }

}
