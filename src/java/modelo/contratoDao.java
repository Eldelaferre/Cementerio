
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class contratoDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    contrato co;
    
    public int insertarcontrato(contrato con){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcontrato values(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, con.getNumContrato());
            ps.setInt(2, con.getCodempleado());
            ps.setString(3, con.getTipopagocontra());
            ps.setString(4, con.getDescripagocontra());
            ps.setInt(5, con.getCantpagocontra());
            ps.setInt(6, con.getSalariocontra());
            ps.setString(7, con.getFecinicontra());
            ps.setString(8, con.getFecfincontra());
            ps.setString(9, con.getTipocontra());
            ps.setString(10, con.getCargocontra());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
}
