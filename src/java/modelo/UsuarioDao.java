package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDao {
    
    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Usuario us;
    
    public int Insertar_Usuario(Usuario usu) {
        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO tbusuario VALUES(?,?,?,?)");
            ps.setInt(1, usu.getCodigo_Usuario());
            ps.setString(2, usu.getRol_Usuario());
            ps.setString(3, usu.getUser_Usuario());
            ps.setString(4, usu.getClave_Usuario());
            
            x = ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos ok");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + e);
        }
        return x;

    }
    
    public ArrayList<Usuario> Consulta_Gen_Usuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("SELECT * FROM tbusuario");
            rs = ps.executeQuery();
            while (rs.next()) {
                us = new Usuario(rs.getInt(1),rs.getString(2),rs.getNString(3),rs.getString(4));
                lista.add(us);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error En la consulta" + e);
        }
        return lista;
    }
    
    public boolean Actualizar_Usuario( Usuario us) {
        JOptionPane.showMessageDialog(null,"Entró a la actualizacion"+ us);
        int x;
        boolean r = false;
        try {
            ps = cnn.prepareStatement("UPDATE tbusuario SET  Usua_rol=?, Usua_user=?, Usua_clave=?, WHERE Usua_codigo=?");
            
            
            ps.setString(1, us.getRol_Usuario());
            ps.setString(2, us.getUser_Usuario());
            ps.setString(3, us.getClave_Usuario());
            ps.setInt(4, us.getCodigo_Usuario());
            
            
            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar" + e);
        }
        return r;
    }
    

}
