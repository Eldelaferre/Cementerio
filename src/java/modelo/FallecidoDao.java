
package Modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FallecidoDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Fallecido fal;
    
    public int insertarFallecido(Fallecido fal){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO Tbfallecido VALUES(?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,fal.getCodfallecido());
            ps.setInt(2,fal.getCodtumba());
            ps.setString(3,fal.getNomfalle());
            ps.setString(4,fal.getFecnaci());
            ps.setString(5,fal.getFecmuerte());
            ps.setString(6,fal.getFechora());
            ps.setString(7,fal.getResponsable());
            ps.setString(8,fal.getCorreo());
            ps.setInt(9,fal.getTel());
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    }
}