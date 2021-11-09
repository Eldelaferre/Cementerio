
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class tumbaDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    tumba tu;
    
    public int insertartumba(tumba tum){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into Tbtumba values(?,?,?)");
            ps.setInt(1, tum.getCodigo());
            ps.setInt(2, tum.getCodigoemp());
            ps.setString(3, tum.getUbicacion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
