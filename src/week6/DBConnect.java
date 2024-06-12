package week6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static void main(String[] args) {


        String url="jdbc:postgresql://localhost:5432/University";
        String user="postgres";
        String password="hakanka1";

        Connection conn=null;

        try {

            conn= DriverManager.getConnection(url,user,password);

            if(conn!=null){
                System.out.println("Veritabanına başarıyla bağlanıldı!");
            }
            else{
                System.out.println("Veritabanına bağlanılamadı!");
            }
        }
        catch (SQLException e){

            System.out.println(e.getMessage());
        }
    }
}
