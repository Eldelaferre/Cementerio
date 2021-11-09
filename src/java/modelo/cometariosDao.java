
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class cometariosDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    comentarios co;
    
    public int insertarcomentario(comentarios com){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcomentariossanitarios values(?,?,?,?)");
            ps.setInt(1, com.getCodigo());
            ps.setInt(2, com.getCodigovisita());
            ps.setString(3, com.getFecha());
            ps.setString(4, com.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
