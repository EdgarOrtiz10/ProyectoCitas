/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import javax.swing.JOptionPane;

/**
 *
 * @author Edgar O
 */
public class Conexion {
    
    String user = "edgarCitas";
    String pass = "12345";
    String bd = "proyectoCitas";
    String ip = "localhost";
    String port ="1433"; 
          
    public static Connection getConexion(){//Connection es de la liberia descargada de Java para sql serve
        String url = "jdbc:sqlserver://localhost:1433;" // ingresamos los datos del servidor sql server
        + "databaseName=proyectoCitas;"
        + "encrypt=true;"
        + "trustServerCertificate=true;"
        + "user = edgarCitas;"
                + "password=12345;";
        //Este proceso que se va realizar es para poder tener una conexión correcta
        try{
           Connection connectionToDB = DriverManager.getConnection(url); //Creamos una variable de tipo Connection
           return connectionToDB; 
        } catch(SQLException e){ // Sirve para que capture alguna excepción
            System.out.println(e.toString()); //Podamos visualizar los errores en caso de que se tengan 
            return null; // ya que no se pudo realizar la conexion.
        }
    
    }
}
