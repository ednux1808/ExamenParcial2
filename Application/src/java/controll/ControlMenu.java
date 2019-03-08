package controll;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import modell.Vista;


/**
 *
 * @author 6-X
 */
@ManagedBean
@RequestScoped
public class ControlMenu {

    @ManagedProperty(value = "#{vista}")
    private Vista vista = new Vista();

    /**
     * Este método será utilizado desde el menú  para ir a cualquier página
     * @param enlace Etiqueta utilizada por faces-config
     * @param pagina Nombre de la página a cargar
     * @return 
     */
    public String irA(String enlace,String pagina) {
        this.vista.setPagina(pagina);

        return enlace;
    }
    
    /**
     * Este método será utilizado para ir del login hacia el menú 
     * @param enlace Etiqueta utilizada por faces-config
     * @return 
     */
    public String irA(String enlace){
        return enlace;
    }
    
    public String irAa(String enlace){
        return enlace+".xhtml";
    }
    
    /**
     * Este método será utilizado desde las páginas cargadas
     * @param enlace
     * @return 
     */
    public String regresar (String enlace){
        return enlace;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

}
