package controlador;

import beans.Usuario;
import beans.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import negocio.GestionUsuarios;
import negocio.GestionVehiculos;


@WebServlet("/RegistrarVehiculo")
public class RegistrarVehiculo extends HttpServlet {

    /*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {*/
        
     private static final long serialVersionUID = 1L;//no se que significa
       GestionVehiculos gestionVehiculo;
       GestionUsuarios gestionUsuario;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarVehiculo() {
        super();
        gestionVehiculo = new GestionVehiculos();
        gestionUsuario = new GestionUsuarios();
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
		if(session != null){
			
		Usuario user = (Usuario)session.getAttribute("usuario");
		String vehiculo = request.getParameter("matricula");
		Vehiculo nuevovehiculo = new Vehiculo();
		nuevovehiculo.setMatricula(vehiculo);
		nuevovehiculo.setUsuario(user);
		gestionVehiculo.guardarVehiculo(nuevovehiculo);
		user= gestionUsuario.recuperarUsuario(user.getNombre());
		session.setAttribute("usuario",user);
		response.sendRedirect("index.html");
		}else{
			
			response.sendRedirect("login.html");
		}
    }


}

