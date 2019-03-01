/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Contactos;
import dao.Conexion;

/**
 *
 * @author 56974
 */
public class implementarMetodos implements metodos.metodosContacto {

    private final Conexion con;

    public implementarMetodos() {

        this.con = new Conexion();

    }

    @Override
    public List<Contactos> contactosSELECT() {

        List<Contactos> lista = null;

        String consulta = "SELECT * FROM contactos";
        Connection conSelect = (Connection) new Conexion();
       
        if (conSelect != null) {

            try {
                PreparedStatement ps = conSelect.prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();

                lista = new LinkedList<Contactos>();
                while (rs.next()) {
                    Contactos contactos = new Contactos();
                    contactos.setId(rs.getInt("id"));
                    contactos.setNombre(rs.getString("nombres"));
                    contactos.setCelular(rs.getString("celular"));
                    contactos.setCorreo(rs.getString("correo"));
                    lista.add(contactos);
                }
                ps.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return lista;
    }

    @Override
    public void contactosINSERT(Contactos contactos) {
        String consulta = "INSERT INTO contactos(nombres,celular,correo) VALUES(?,?,?)";
        Connection conInsert = (Connection) con.getConexion();

        if (conInsert != null) {
            try {
                PreparedStatement ps = conInsert.prepareStatement(consulta);
                ps.setString(1, contactos.getNombre());
                ps.setString(2, contactos.getCelular());
                ps.setString(3, contactos.getCorreo());

                ps.executeUpdate();

                ps.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public Contactos contactoBuscar(int id) {
        Contactos contactos = new Contactos();
        contactos = null;
        String consulta = "SELECT * FROM contactos WHERE id=?";
        Connection conBuscar = (Connection) con.getConexion();

        if (conBuscar != null) {
            try {
                PreparedStatement ps = conBuscar.prepareStatement(consulta);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    contactos = new Contactos();
                    contactos.setId(rs.getInt("id"));
                    contactos.setNombre(rs.getString("nombres"));
                    contactos.setCelular(rs.getString("celular"));
                    contactos.setCorreo(rs.getString("correo"));

                }
                ps.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return contactos;
    }

    @Override
    public void contactosUPDATE(Contactos contactos) {

        String consulta = "UPDATE contactos SET nombres=?, celular=?, correo=? WHERE id=?";
        Connection conUpdate = (Connection) con.getConexion();
        if (conUpdate != null) {
            try {
                PreparedStatement ps = conUpdate.prepareStatement(consulta);
                ps.setString(1, contactos.getNombre());
                ps.setString(2, contactos.getCelular());
                ps.setString(3, contactos.getCorreo());
                ps.setInt(4, contactos.getId());

                ps.executeUpdate();
                ps.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    @Override
    public void contactosDELETE(int id) {
        String consulta = "DELETE * FROM contactos WHERE id=?";
        Connection conDelete = (Connection) con.getConexion();

        if (conDelete != null) {
            try {
                PreparedStatement ps = conDelete.prepareStatement(consulta);

                ps.setInt(1, id);
                ps.executeUpdate();
                ps.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    @Override
    public String getMensaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
