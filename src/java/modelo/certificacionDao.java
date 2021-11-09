
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class certificacionDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    certificacion ce;
    
    public int insertarcertificacion(certificacion cer){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcertificadolaboral values(?,?,?)");
            ps.setInt(1, cer.getCodigo());
            ps.setInt(2, cer.getNumcontrato());
            ps.setString(3, cer.getMotivo());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
