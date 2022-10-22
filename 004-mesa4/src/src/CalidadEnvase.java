public class CalidadEnvase extends CompruebaCalidad{


    @Override
    public void validarCalidadProducto(Producto producto) {
        if (producto.getEnvase().equals(Tipo.Casi_Sano) || producto.getEnvase().equals(Tipo.Sano)) {
            System.out.println(producto.toString());
            System.out.println("PASO ESTANDAR DE CALIDAD DE ENVASE");
        }else if (this.sigCalidad != null)
            this.sigCalidad.validarCalidadProducto(producto);
    }
}