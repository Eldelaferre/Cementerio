
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class empleadoDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    empleado em;
    
    public int insertarempleado(empleado emp){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into Tbempleado values(?,?,?,?,?,?)");
            ps.setInt(1, emp.getCodigo());
            ps.setString(2, emp.getTipo());
            ps.setString(3, emp.getNombre());
            ps.setString(4, emp.getDireccion());
            ps.setString(5, emp.getTelefono());
            ps.setString(6, emp.getEmail());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
