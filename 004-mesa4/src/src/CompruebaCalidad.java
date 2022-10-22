public abstract class CompruebaCalidad {

    protected CompruebaCalidad sigCalidad;

    public abstract void validarCalidadProducto(Producto producto);

    public CompruebaCalidad setsigCalidad(CompruebaCalidad sigCalidad) {
        this.sigCalidad = sigCalidad;
        return this;
    }


    public void validarCalidadDelProducto(Producto producto) {

    }
}
