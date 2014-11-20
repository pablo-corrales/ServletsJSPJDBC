package webArchitecture.persona.v1.viewsBeans;

import webArchitecture.persona.v1.models.entities.Persona;

public class PersonaView {
    private String msg;

    private Persona persona;

    private String[] roles;

    public PersonaView() {
        // Se ataca a la Capa de Negocio para conseguir los roles!!!
        this.roles = new String[] {"uno", "dos", "tres"};
    }

    public String getMsg() {
        return msg;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String process() {
        if (this.persona.getId() == 666 && !this.persona.getNombre().equals("Demonio")) {
            this.msg="Sólo se acepta el nombre 'Demonio'";
            return "persona";
        } else {
            // Se ataca a la Capa de Negocio para registrar el usuario!!!
            return "home";
        }
    }

}
