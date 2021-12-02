import org.junit.Test;

import Colecciones.Ejercicio05;
import Colecciones.Producto;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Ejercicio05Test {
    
    @Test
    public void testOrdenarProductosId() {
        List<Producto> productos = Arrays.asList(
            new Producto(5, "Tuerca", 5, LocalDate.of(2018, 5, 20)),
            new Producto(1, "Perno", 1, LocalDate.of(2019, 6, 30)),
            new Producto(3, "Tornillo", 5, LocalDate.of(2019, 6, 30)),
            new Producto(10, "Clavo", 10, LocalDate.of(2019, 12, 21)),
            new Producto(7, "Palometa", 20, LocalDate.of(2018, 7, 21))
        );
        productos = Ejercicio05.ordenarProductosId(productos);
        assertEquals(1, productos.get(0).getId());
        assertEquals(3, productos.get(1).getId());
        assertEquals(5, productos.get(2).getId());
        assertEquals(7, productos.get(3).getId());
        assertEquals(10, productos.get(4).getId());
    }
}
