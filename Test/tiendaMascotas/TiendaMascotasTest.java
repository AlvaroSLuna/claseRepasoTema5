package tiendaMascotas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TiendaMascotasTest {
    private TiendaMascotas tienda;

    @Test
    public void agregarMascota() {
        tienda.agregarMascota("Luis", 2, "Pez");
        Assert.assertEquals(1, tienda.cantidadMascotas);
    }

    @Test
    public void venderMascota() {
        tienda.agregarMascota("Luis", 2, "Pez");
        tienda.agregarMascota("Tana", 5, "Delfin");
        Assert.assertTrue(tienda.venderMascota("Tana"));
        Assert.assertEquals(1, tienda.cantidadMascotas);
    }

    @Test
    public void mostrarInventario() {
        tienda.agregarMascota("Luis", 2, "Pez");
        tienda.agregarMascota("Tana", 5, "Delfin");
        Assert.assertEquals("El inventario es: /n Nombre: Luis /n Nombre: Tana/n", tienda.mostrarInventario());
    }
}