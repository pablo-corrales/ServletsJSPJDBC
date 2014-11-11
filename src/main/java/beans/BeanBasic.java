package beans;

import java.io.Serializable;

public class BeanBasic implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id = 666;

    private String nombre = "Demonio";

    private String[] caras = {"una", "dos", "tres"};

    public BeanBasic() {
        this(666,"demonio", new String[] {"una", "dos", "tres"});
    }

    public BeanBasic(int id, String nombre, String[] caras) {
        this.id = id;
        this.nombre = nombre;
        this.caras = caras;
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

    public String[] getCaras() {
        return caras;
    }

    public void setCaras(String[] caras) {
        this.caras = caras;
    }

}
