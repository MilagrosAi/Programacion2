/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package categoriaproducto;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        ejecutarCasoStock();
    }

    private static void ejecutarCasoStock() {
        System.out.println("CASO PRACTICO 1 - INVENTARIO");
        Inventario inv = new Inventario();

        // Crear al menos 5 productos con diferentes categorias
        inv.agregarProducto(new Producto("P001", "Arroz 1kg", 500.0, 20, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "Auriculares", 2500.0, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera", 1500.0, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Sartén", 3500.0, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Fideo 500g", 300.0, 50, CategoriaProducto.ALIMENTOS));

        // Listar todos
        inv.listarProductos();

        // Buscar por ID
        System.out.println("\nBuscando P002:");
        Producto buscado = inv.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        System.out.println("\nFiltrar por ALIMENTOS:");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();

        // Eliminar producto por ID
        System.out.println("\nEliminar P004:");
        inv.eliminarProducto("P004");
        inv.listarProductos();

        // Actualizar stock
        System.out.println("\nActualizar stock P003 a 40:");
        inv.actualizarStock("P003", 40);
        Producto p003 = inv.buscarProductoPorId("P003");
        if (p003 != null) p003.mostrarInfo();

        // Total stock
        System.out.println("\nTotal de stock disponible: " + inv.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // Filtrar por precio entre 1000 y 3000
        System.out.println("\nProductos entre $1000 y $3000:");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();

        // Mostrar categorias disponibles
        System.out.println();
        inv.mostrarCategoriasDisponibles();
    }
}
