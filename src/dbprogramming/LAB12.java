package dbprogramming;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class LAB12 {
 public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "Nitikorn-10";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            String sql = "INSERT INTO student (studentID, firstName, lastName, email, deptID) " 
                    + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"aaaa");
            preparedStatement.setString(3,"bbbb");
            preparedStatement.setString(4,"aaa@kmutt.ac.th");
            preparedStatement.setString(5,"IT");
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
