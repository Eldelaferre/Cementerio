
package Modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class LoginDao {
   Conexion con=new Conexion();
   Connection cnn=con.conexionbd();
   PreparedStatement ps;
   ResultSet rs;
   
   public ArrayList <Login> logindao(Login lo){
        ArrayList<Login>lista=new ArrayList<>();
        
       try {
           ps=cnn.prepareStatement("SELECT Usua_rol,Usua_user,Usua_clave,Usua_codigo,Emple_nombre FROM TbUsuario inner join Tbempleado on (Usua_codigo=Emple_codigo) WHERE Usua_user=? && Usua_clave=?");
           ps.setString(1,lo.getUsuario());
           ps.setString(2,lo.getClave());
   
           
           
           rs=ps.executeQuery();
           
           if(rs.next()){
               Login log=new Login(rs.getString(1), rs.getString(2), rs.getString(3),rs.getInt(4),rs.getString(5));
               lista.add(log);
               JOptionPane.showMessageDialog(null," oso "+lo.getNombre()+lo.getRol());
                         
           }
           
           
                   } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "error en login"+ex);
       }
       return lista;         
    }
   
   
}
