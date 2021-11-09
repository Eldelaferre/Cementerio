
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PQRSDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    PQRS pq;
    
    public int insertarPQRS(PQRS pqrs){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TbPQRS values(?,?,?,?)");
            ps.setInt(1, pqrs.getCodigo());
            ps.setInt(2, pqrs.getCodigovis());
            ps.setString(3, pqrs.getFecha());
            ps.setString(4, pqrs.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
