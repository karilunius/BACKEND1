package impl;

import model.Articulo;

public class AnalistaDeCalidad {
    private CTRL ctrl;

    public CTRL getCtrl() {
        return ctrl;
    }
    public void setCtrl(CTRL ctrl) {
        this.ctrl = ctrl;
    }

    public void admin(){
        CTRL lote = new CTRLLote();
        CTRL peso = new CTRLPeso();
        CTRL envase = new CTRLEnvase();
        this.setCtrl(lote);
        lote.setSigCTRL(peso);
        peso.setSigCTRL(envase);

        envase.setSigCTRL(null);
    }

    public void comprobarCalidad(Articulo articulo){
        this.ctrl.validarCalidadDelProducto(articulo);
    }

    public String resultadoFinal(Articulo articulo) {
        for (Integer i = 0; i < articulo.getControl().length; i ++){
            if (!articulo.getControl()[i]){
                return "no paso todos los controles";
            }
        }
        return "paso todos los controles";
    }


}
