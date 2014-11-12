package webArchitecture.persona.v1.controllers;

public class PersonaBean {
    private int id;

    private String nombre;

    public PersonaBean() {
    }

    public PersonaBean(int id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String process() {
        if (this.id == 666) {
            this.nombre="Demonio";
            return "personaDemonio";
        } else {
            return "personaOtros";
        }
    }

}
