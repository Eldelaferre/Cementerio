
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public boolean actualizarempleado(empleado empactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update Tbempleado set Emple_tipo=?,Emple_nombre=?,Emple_direccion=?,Emple_telefono=?,Emple_email=? where Emple_codigo=?");
            
            ps.setString(1, empactu.getTipo());
            ps.setString(2, empactu.getNombre());
            ps.setString(3, empactu.getDireccion());
            ps.setString(4, empactu.getTelefono());
            ps.setString(5, empactu.getEmail());
            ps.setInt(6, empactu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    public ArrayList<empleado> consultageneralempleado(){
       ArrayList<empleado> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from Tbempleado");
            rs=ps.executeQuery();
            while(rs.next()){
                em=new empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                lista.add(em);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
