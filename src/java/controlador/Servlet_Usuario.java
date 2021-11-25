/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import modelo.Usuario;
import modelo.UsuarioDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servlet_Usuario", urlPatterns = {"/Servlet_Usuario"})
@MultipartConfig
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
        
        JOptionPane.showMessageDialog(null, "Ser");
        JOptionPane.showMessageDialog(null, "  El nombre");
        if(request.getParameter("op").equals("ins")){
        int d;
        Boolean y;
        String r, u, c;

        d = Integer.parseInt(request.getParameter("Documento"));
        r = request.getParameter("rol");
        u = request.getParameter("usuario");
        c = getMD5(request.getParameter("Nombres"));
        Part i = request.getPart("img");

        JOptionPane.showMessageDialog(null, u + "  El Usuario");
        
        String nomfoto=i.getSubmittedFileName();
            
        String nombre=u+""+nomfoto;
        String Url="C:\\Users\\jonat\\Documents\\GitHub\\Cementerio\\web\\imagenes\\"+nombre;
        String Url2="imagenes/"+nombre;
            
        InputStream file=i.getInputStream();
        File f=new File(Url);
        FileOutputStream sal=new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }

        Usuario usuario = new Usuario(d, r, u, c, Url2);
        UsuarioDao usdao = new UsuarioDao();

        y = usdao.Insertar_Usuario(usuario);
        if (y) {
            JOptionPane.showMessageDialog(null, " guardados");
            response.sendRedirect("Usuario.jsp");
        } else {
            JOptionPane.showMessageDialog(null, " Fail");
            response.sendRedirect("Usuario.jsp");
        }
        }
        if(request.getParameter("dato").equals("actualizar")){
            int d;
            Boolean dat;
            String r, u, c;

            d = Integer.parseInt(request.getParameter("Documento"));
            r = request.getParameter("rol");
            u = request.getParameter("usuario");
            c = getMD5(request.getParameter("Nombres"));         
            Part i = request.getPart("img");

            JOptionPane.showMessageDialog(null, u + "  El Usuario");
        
            String nomfoto=i.getSubmittedFileName();
            
            String nombre=u+""+nomfoto;
            String Url="C:\\Users\\jonat\\Documents\\GitHub\\Cementerio\\web\\imagenes"+nombre;
            String Url2="imagenes/"+nombre;
            
            InputStream file=i.getInputStream();
            File f=new File(Url);
            FileOutputStream sal=new FileOutputStream(f);
            int num=file.read();
            while(num != -1){
                sal.write(num);
                num=file.read();
            }

            Usuario usuario = new Usuario(d, r, u, c, Url2);
            UsuarioDao usdao = new UsuarioDao();
            dat=usdao.actualizarusuario(usuario);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("Usuario.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("Usuario.jsp");
            }
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
