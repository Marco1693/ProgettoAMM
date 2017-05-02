/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.Classi.UtenteFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marco
 */
public class Login extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        
        if(request.getParameter("logout")!=null)
        {
            session.invalidate();
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }
        
        //Se esiste un attributo di sessione loggedIn e questo vale true
        //(Utente già loggato)
        if (session.getAttribute("loggedIn") != null &&
            session.getAttribute("loggedIn").equals(true)) {
            request.getRequestDispatcher("Bacheca").forward(request, response);
            return;
        
        //Se l'utente non è loggato...
        } else {
            String username = request.getParameter("nickname");
            String password = request.getParameter("password");
        
            
            /*
            Nelle slide viste a lezione è presente una versione leggermente 
            differente che utilizza un metodo this.login il quale restituisce 
            true se la coppia user/pass è valida, false altrimenti.
            L'implementazione di GaTeender prevede che se sono presenti
            i parametri post username e password (inviati dal loginForm.jsp)
            allora verifica che questa coppia corrisponda a un gatto registrato 
            (id!=-1) e in caso positivo imposta :
            -attributo di sessione loggedIn a true
            -attributo di sessione loggedUserId contenente lo userID dell'utente 
             loggato
            */
            if (username != null &&
                password != null) 
            {
                int loggedUserID = UtenteFactory.getInstance().getIdByUserAndPassword(username, password);
                
                //se l'utente è valido...
                if(loggedUserID!=-1)
                {
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("loggedUserID", loggedUserID);
                    
                    if(UtenteFactory.getInstance().getUtenteById(loggedUserID).getNome()== null ||
                       UtenteFactory.getInstance().getUtenteById(loggedUserID).getCognome()== null ||
                       UtenteFactory.getInstance().getUtenteById(loggedUserID).getUrlFotoProfilo()== null ||
                       UtenteFactory.getInstance().getUtenteById(loggedUserID).getFraseDiPresentazione()== null)
                    {
                        request.getRequestDispatcher("Profilo").forward(request,response);
                        return;
                    }else{
                        request.getRequestDispatcher("Bacheca").forward(request, response);
                        return;
                    }
                } else { //altrimenti se la coppia user/pass non è valida (id==-1)
                    
                    //ritorno al form del login informandolo che i dati non sono validi
                    request.setAttribute("invalidData", true);
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    return;
                }
                
                
            }
        }
        
        /*
          Se non si verifica nessuno degli altri casi, 
          tentativo di accesso diretto alla servlet Login -> reindirizzo verso 
          il form di login.
        */
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
