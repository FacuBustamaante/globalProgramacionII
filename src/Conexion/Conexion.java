package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "BuenSabor";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var passwword = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, passwword);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conexion;
    }

//    public static void main(String[] args) {
//        var conexion = Conexion.getConexion();
//        if(conexion !=null){
//            System.out.println("Conexion Exitosa: " + conexion);
//        }else {
//            System.out.println("Error");
//        }
//    }
}