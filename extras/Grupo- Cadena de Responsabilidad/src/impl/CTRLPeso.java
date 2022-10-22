package impl;

import model.Articulo;

public class CTRLPeso extends CTRL{

    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getPeso() > 1200 && articulo.getPeso() < 1300){
            articulo.addControl(1, true);
        }
        else {
            articulo.addControl(1, false);
        }
        resultado(articulo, 1, "peso");
        getSigCTRL().validarCalidadDelProducto(articulo);
    }

}
