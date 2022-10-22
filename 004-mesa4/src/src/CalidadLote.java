public class CalidadLote extends CompruebaCalidad{


    @Override
    public void validarCalidadProducto(Producto producto) {
        if (producto.getLote() >= 1000 && producto.getLote() <= 2000) {
            System.out.println(producto.toString());
            System.out.println("PASO ESTANDAR DE CALIDAD DE LOTE");
        }else if (this.sigCalidad != null)
            this.sigCalidad.validarCalidadProducto(producto);
    }
}
