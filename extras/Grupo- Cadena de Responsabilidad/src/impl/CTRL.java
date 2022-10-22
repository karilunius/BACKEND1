package impl;

import model.Articulo;

public abstract class CTRL {

    private CTRL sigCTRL;

    public CTRL getSigCTRL() {
        return sigCTRL;
    }

    public void setSigCTRL(CTRL sigCTRL) {
        this.sigCTRL = sigCTRL;
    }

    public abstract void validarCalidadDelProducto(Articulo articulo);

    public void resultado(Articulo articulo, Integer pos, String control) {
        if (articulo.getControl()[pos]) {
            System.out.println("paso el control " + control);
        } else {
            System.out.println("no paso el control " + control);
        }
    }

}
