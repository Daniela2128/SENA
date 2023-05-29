/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aprendiz;
import modeldao.AprendizDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorAprendiz", urlPatterns = {"/ControladorAprendiz"})
public class ControladorAprendiz extends HttpServlet {

       String agregarape = "index.jsp";
   String listadoape = "view/listadoape.jsp";
   String editarape= "view/EditarA.jsp";
   
   Aprendiz p = new Aprendiz();
   AprendizDao adao = new AprendizDao();
   int id; 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAprendiz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAprendiz at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar "))
        {
            acceso=listadoape;
        }else if(action.equalsIgnoreCase("agregarape"))
        {
         acceso = agregarape;
        }
        else if(action.equalsIgnoreCase("Agregar"))
        {
            
            int Docu = Integer.parseInt(request.getParameter("txtdocuape"));
            String nomape = request.getParameter("txtnombreape");
            String apeape = request.getParameter("txtapelliape");
            String corrape = request.getParameter("txtcorreoape");
            int numape = Integer.parseInt(request.getParameter("txtnumeape"));
     

            p.setDocu(Docu);
            p.setNombreap(nomape);
            p.setApellidoap(apeape);
            p.setCorreoap(corrape);
            p.setTeleap(numape);
            adao.registrarape(p);
            acceso=listadoape;
        }else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            p.setid(id);
            adao.eliminarape(id);
            acceso=listadoape;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("id",request.getParameter("id"));
            acceso=editarape;
        
        }else if(action.equalsIgnoreCase("actualizar")){
            id=Integer.parseInt(request.getParameter("txtId"));
            int Docu=Integer.parseInt(request.getParameter("txtdocu"));
            String nombreap=request.getParameter("txtnombreap");
              String apellidoap=request.getParameter("txtapellidoap");
                String correoap=request.getParameter("txtcorreoap");
                int teleap=Integer.parseInt(request.getParameter("txtteleap"));
                
                p.setid(id);
                p.setNombreap(nombreap);
                p.setApellidoap(apellidoap);
                p.setCorreoap(correoap);
                p.setTeleap(teleap);
                adao.actualizarape(p);
                acceso=listadoape;
        
        }
            RequestDispatcher view=request.getRequestDispatcher(acceso);
            view.forward(request, response);
        
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
