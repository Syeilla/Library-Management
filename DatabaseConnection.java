/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gsyei
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/perpustakaan_kampus";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection successfull!");
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
        } 
        return connection;
    }
    

//    public static class Koneksi {
//        private static final String driver = "com.mysql.cj.jdbc.Driver"; // updated driver class name
//        private static final String user = "root"; // Your database username
//        private static final String pass = ""; // Your database password
//        private static final String url = "jdbc:mysql://localhost:3306/perpustakaan_kampus"; // Your database URL
//
//        private Connection con;
//
//        public Connection getCon() {
//            try {
//                Class.forName(driver).newInstance();
//                con = DriverManager.getConnection(url, user, pass);
//                System.out.println("Connection successful!");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return con;
//        }
//
//        public void closeCon() {
//            try {
//                if (con != null && !con.isClosed()) {
//                    con.close();
//                    System.out.println("Connection closed!");
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Koneksi koneksi = new Koneksi();
//        Connection connection = koneksi.getCon();
//
//        // Perform database operations here
//        if (connection != null) {
//            try {
//                // Create a statement
//                Statement statement = connection.createStatement();
//
//                // Execute a query
//                String sql = "SELECT * FROM buku";
//                ResultSet resultSet = statement.executeQuery(sql);
//
//                // Process the result set
//                while (resultSet.next()) {
//                    String idBuku = resultSet.getString("ID_Buku");
//                    String kategoriBuku = resultSet.getString("Kategori_Buku");
//                    int kodeJudulBuku = resultSet.getInt("Kode_Judul_Buku");
//                    String judulBuku = resultSet.getString("Judul_Buku");
//                    String pengarang = resultSet.getString("Pengarang");
//                    String penerbit = resultSet.getString("Penerbit");
//                    int tahunTerbit = resultSet.getInt("Tahun_Terbit");
//                    String isbn = resultSet.getString("ISBN");
//
//                    System.out.println("ID_Buku: " + idBuku + ", Kategori_Buku: " + kategoriBuku + ", Kode_Judul_Buku: " + kodeJudulBuku + ", Judul_Buku: " + judulBuku + ", Pengarang: " + pengarang + ", Penerbit: " + penerbit + ", Tahun_Terbit: " + tahunTerbit + ", ISBN: " + isbn);
//                }
//
//                // Close the result set and statement
//                resultSet.close();
//                statement.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                // Close the connection
//                koneksi.closeCon();
//            }
//        }
//    }
}
