/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import modelo.Usuario;
import modelo.UsuarioDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servlet_Usuario", urlPatterns = {"/Servlet_Usuario"})
public class Servlet_Usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        JOptionPane.showMessageDialog(null, "Ser en ser ");
        
        String  u, c, r;
        int d, y;

        d = Integer.parseInt(request.getParameter("d"));
        u = request.getParameter("u");
        c = getMD5(request.getParameter("c"));
        r = request.getParameter("r");
        
        
        JOptionPane.showMessageDialog(null, d+u+c+r);

        Usuario usuario = new Usuario(d, r, u, c);
        UsuarioDao usudao = new UsuarioDao();

        y = usudao.Insertar_Usuario(usuario);
        if (y > 0) {

            response.sendRedirect("Usuario.jsp");
            JOptionPane.showMessageDialog(null, " guardados");
        } else {
            JOptionPane.showMessageDialog(null, "danos no guardados");
            response.sendRedirect("Usuario.jsp");
        }
        
        
    }
        public String getMD5(String input){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] encBytes=md.digest(input.getBytes());
            BigInteger numero=new BigInteger(1, encBytes);
            String encString=numero.toString(16);
            while(encString.length()<32){
                encString="0"+encString;
            }
         return encString; 
         } catch (Exception e) {
             throw new RuntimeException(e);
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
