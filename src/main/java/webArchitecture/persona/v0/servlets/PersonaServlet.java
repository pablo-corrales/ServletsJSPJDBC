package webArchitecture.persona.v0.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webArchitecture.persona.v0.beans.PersonaBean;

@WebServlet("/v0/PersonaServlet")
// En 3.0 se utilizan anotaciones en lugar de XML
public class PersonaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PersonaBean personaBean = new PersonaBean();
        request.setAttribute("personaBeanV0", personaBean);

        String nombre = request.getParameter("nombre");
        if (nombre != null) {
            personaBean.setNombre(nombre);
        }

        String[] roles = request.getParameterValues("roles");
        if (roles != null) {
            personaBean.setRoles(roles);
        }
        
        personaBean.process();

        this.getServletContext().getRequestDispatcher("/" + "v0/personaJSP.jsp")
                .forward(request, response);
    }

}
