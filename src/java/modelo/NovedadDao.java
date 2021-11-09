
package Modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class NovedadDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Novedad no;
    
    public int insertarNovedad(Novedad no){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TBnovedad VALUES(?,?,?,?,?)");
            ps.setInt(1,no.getCodnove());
            ps.setInt(2,no.getCodemple());
            ps.setString(3,no.getFecnove());
            ps.setString(4,no.getDescrinove());
            ps.setString(5,no.getEstnove());
            
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    }
}
