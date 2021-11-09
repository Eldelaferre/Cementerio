/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class EstadoDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Estado es;
    
    public int insertarEstado(Estado es){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TbEstado VALUES(?,?,?,?,?)");
            ps.setInt(1,es.getCodestado());
            ps.setInt(2,es.getCodfallecido());
            ps.setString(3,es.getFecreal());
            ps.setString(4,es.getHorreal());
            ps.setString(5,es.getTipo());
            
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    } 
}
