package productos;

public class ArticuloBaño extends Producto {
    private double contenido;

    public ArticuloBaño(String nombre, double contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}