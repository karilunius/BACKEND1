import impl.AnalistaDeCalidad;
import model.Articulo;
import model.Envase;

public class Main {
    public static void main(String[] args) {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();

        Articulo art = new Articulo("jugo", 1001, 1202, Envase.SANO);

        analista.admin();
        analista.comprobarCalidad(art);

        System.out.println(analista.resultadoFinal(art));
    }
}