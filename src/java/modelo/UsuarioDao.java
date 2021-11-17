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

}
