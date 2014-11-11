package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BeanPersona;

@WebServlet("/ServletPersona")
// En 3.0 se utilizan anotaciones en lugar de XML
public class ServletPersona extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BeanPersona beanPersona = new BeanPersona();
        request.setAttribute("beanPersona", beanPersona);

        String nombre = request.getParameter("nombre");
        if (nombre != null) {
            beanPersona.setNombre(nombre);
        }

        String[] roles = request.getParameterValues("roles");
        if (roles != null) {
            beanPersona.setRoles(roles);
        }
        
        beanPersona.process();

        this.getServletContext().getRequestDispatcher("/" + "jspPersona.jsp")
                .forward(request, response);
    }

}
