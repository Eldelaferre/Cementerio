
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class actividadDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    actividad ac;
    
    public int insertaractividad(actividad act){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBactividad values(?,?,?,?)");
            ps.setInt(1, act.getCodigo());
            ps.setInt(2, act.getCodempleado());
            ps.setString(3, act.getFecha());
            ps.setString(4, act.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
