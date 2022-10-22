package impl;

import model.Articulo;
import model.Envase;

public class CTRLEnvase extends CTRL{
    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getEnvasado() == Envase.SANO) {
            articulo.addControl(2, true);
        }
        else {
            articulo.addControl(2, false);
        }
        resultado(articulo, 2, "envase");
        getSigCTRL().validarCalidadDelProducto(articulo);
    }

}
