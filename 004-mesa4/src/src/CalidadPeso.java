public class CalidadPeso extends CompruebaCalidad{


    @Override
    public void validarCalidadProducto(Producto producto) {
        if (producto.getPeso() >= 1200 && producto.getPeso()<= 1300) {
            System.out.println(producto.toString());
            System.out.println("PASO ESTANDAR DE CALIDAD DE PESO");
        }else if (this.sigCalidad != null)
            this.sigCalidad.validarCalidadProducto(producto);
    }
}