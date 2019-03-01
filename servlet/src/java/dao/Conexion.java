/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 56974
 */
public class Conexion {
    private Connection conexion;
    private String usuario="";
    private String password="";
    private String url="";

    public Conexion() {
        this.usuario = "root";
        this.url = "jdbc:mysql://localhost:3306/crudservlet";
        this.password = "";
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection(url,usuario,password);
            System.out.println(" contactadisimo");
           
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        
        
    }

    public Connection getConexion() {
        
        return conexion;
    }

 public Connection cerrarConexion(){
        try {
            conexion.isClosed();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return conexion=null;
 }
  
   
}
