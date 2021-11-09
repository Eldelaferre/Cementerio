package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VisitanteDao {

    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;

    public int Insertar_Visitante(Visitante vis) {

        JOptionPane.showMessageDialog(null, "Dao");

        int x = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO tbvisitante VALUES(?,?,?,?,?,?)");
            ps.setInt(1, vis.getCodigo_Visitante());
            ps.setInt(2, vis.getCodigo_Usuario());
            ps.setString(3, vis.getNombre_Visitante());
            ps.setString(4, vis.getDireccion_Visitante());
            ps.setString(5, vis.getTelefono_Visitante());
            ps.setString(6, vis.getEmail_Visitante());

            x = ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos ok");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + e);
        }
        return x;

    }

}
