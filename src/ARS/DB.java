package ARS;
import java.sql.*;
public class DB {
    Connection con;
    Statement stm;
    DB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ars","root","");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ars",
                    "root",
                    ""
            );

            stm = con.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new DB();
    }
}
