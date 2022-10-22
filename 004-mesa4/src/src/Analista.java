public class Analista {

    public static void main(String[] args) {


        //Creo varios productos

        Producto producto1 = new Producto("Helado",Tipo.Casi_Sano,324,1000); //no cumple
        Producto producto2 = new Producto("Avena",Tipo.Sano,1540,1350); //Cumple
        System.out.println(producto1.toString());
        CompruebaCalidad sistemaCalidadControl = new CalidadLote().setsigCalidad(new CalidadPeso().setsigCalidad(new CalidadEnvase()));

        sistemaCalidadControl.validarCalidadDelProducto(producto1);






    }
}
