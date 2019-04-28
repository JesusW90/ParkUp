package servlets;
 
import beans.UsuarioDao;
import clases.Validador;
import java.io.IOException;
import java.util.regex.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class Login extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("index.jsp");
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession respuesta = request.getSession(true);
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Pattern p = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher m = p.matcher(email);
        Validador v = new Validador();
        DaoUsuario d = new UsuarioDao();
        
       
        if (email.isEmpty() || password.isEmpty()) {
            respuesta.setAttribute("error", "Hay campos vacios");
 
        } else {
            
            if (m.find()) {
                respuesta.setAttribute("error", "La direccion de email no es correcta");
 
            } else {
               
                if (v.isUsernameOrPasswordValid(password)) {
                        try {
                            d.conectar();
                            if (d.isAcountExists(email, password)) {
         
                                String NombreUsuario = d.getNameByEmail(email);
                                respuesta.setAttribute("sessionNombre", NombreUsuario);
                                respuesta.setAttribute("sessionEmail", email);
                                
                            } else {
                                respuesta.setAttribute("error", "Esta direccion de correo ya fue registrada");
                            }
 
                            d.desconectar();
 
                        } catch (Exception e) {}
 
 
                    
 
                } else {
                    respuesta.setAttribute("error", "Contraseña no es válida");
 
                }
 
 
            }
        }
 
        response.sendRedirect("login.jsp");
 
    }
}