package week6;

import java.sql.*;

public class Employee {
    public static void main(String[] args) {

        /*Soru: JDBC kullanarak bir MySQL veritabanına bağlanan ve belirli bir tablodan veri çeken
          ve çekilen veriyi ekrana yazdıran bir Java uygulaması yazınız.
          Veritabanında işlem yaparak "employees" adında bir tablo ve her bir çalışanın "id", "name", "position" ve "salary" olmak üzere 4 sütun oluşturun.
          Manuel olarak veri tabanındaki employees tablosuna en az 5 tane employee kaydedin.
        */

        String url = "jdbc:postgresql://localhost:5432/University";
        String user = "postgres";
        String password = "hakanka1";

        Connection conn = null;
        Statement st=null;


        try {
            conn = DriverManager.getConnection(url, user, password);
            st= conn.createStatement();
            ResultSet resultSet=st.executeQuery("SELECT * FROM employees");
            while(resultSet.next()){
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("Name : " + resultSet.getString("name"));
                System.out.println("Position : " + resultSet.getString("position"));
                System.out.println("Salary : " + resultSet.getInt("salary"));
                System.out.println();
            }
            st.close();
            resultSet.close();
            conn.close();



        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}
