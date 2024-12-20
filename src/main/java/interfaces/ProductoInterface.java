package interfaces;

import java.util.List;

import entidades.Categoria;
import entidades.Producto;

public interface ProductoInterface {
    boolean agregarProducto(Producto producto);
    boolean actualizarProducto(Producto producto);
    boolean eliminarProducto(int id);
    List<Producto> obtenerProductos();
    Producto obtenerProductoPorId(int id);
    
    List<Producto> obtenerProductosEnStockPorCategoria(int idCategoria);
    
    boolean agregarCategoria(Categoria categoria);
    List<Categoria> obtenerCategorias();
}
