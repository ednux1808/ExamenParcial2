
package modell;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 6-X
 */

@ManagedBean
@SessionScoped
public class Vista {
    private String pagina = "";

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
    
}
