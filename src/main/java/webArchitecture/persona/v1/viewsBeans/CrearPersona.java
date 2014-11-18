package webArchitecture.persona.v1.viewsBeans;

import webArchitecture.persona.v1.models.entities.Persona;
import webArchitecture.persona.v1.models.entities.Roles;

public class CrearPersona {

    private Persona persona;

    private Roles roles;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String process() {
        if (this.persona.getId() == 666) {
            this.persona.setNombre("Demonio");
            return "personaDemonio";
        } else {
            return "personaOtros";
        }
    }

}
