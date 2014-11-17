package webArchitecture.persona.v1.controllers;

import webArchitecture.persona.v1.models.entities.Persona;

public class PersonaBean {

    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
