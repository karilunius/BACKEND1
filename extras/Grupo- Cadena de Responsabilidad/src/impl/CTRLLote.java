package impl;

import model.Articulo;

public class CTRLLote extends CTRL{

    @Override
    public void validarCalidadDelProducto(Articulo articulo) {
        if (articulo.getLote() > 1000 && articulo.getLote() < 2000){
            articulo.addControl(0, true);
        }
        else {
            articulo.addControl(0, false);
        }
        resultado(articulo, 0, "lote");
        getSigCTRL().validarCalidadDelProducto(articulo);
    }


}
