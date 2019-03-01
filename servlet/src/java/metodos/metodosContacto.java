/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.List;
import modelo.Contactos;

/**
 *
 * @author 56974
 */
public interface metodosContacto {
    public List<Contactos> contactosSELECT();
    
    public void contactosINSERT(Contactos contactos);
    
    public Contactos contactoBuscar(int id);
    
    public void contactosUPDATE(Contactos contactos);
    
    public void contactosDELETE(int id);
    
    public String getMensaje();
}
