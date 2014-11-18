package webArchitecture.persona.v1.models.entities;

import java.util.ArrayList;
import java.util.List;

public class Roles {
    private List<String> valores;
    
    public Roles(){
        valores= new ArrayList<String>();
    }
    
    public List<String> getValores() {
        return valores;
    }

    public void add(String rol){
        this.valores.add(rol);
    }
    
    public void reset(){
        this.valores.clear();
    }
    
}
