package org.tarea6;
/**
 * Esta clase sirve para calcular y aplicar descuentos
 * <ul>
 * <li>Descuento por Artículos (superior a 3)</li>
 * <li>Descuento por Compra (para todas las compras)</li>
 * <li>Sin descuento (no se ha realizado ninguna compra)</li>
 * </ul>
 * @author partision
 */
public class Tarea6EDClase {
    
    /**
     *
     */
    public static final double NODCTO = 0.95;  

    /**
     *
     */
    public static final double DCTO = 0.80;
    
    /**
     * Este método calcula el descuento por comprar más de tres artículos
     * 
     * @param precioProducto
     * @return devuelve el precio del producto con el descuento aplicado
     * @see #aplicarDescuento(double, int) 
     */
    
    public double descuentoPorArticulos(double precioProducto) {
        precioProducto -= 5;
        return precioProducto;
    }
    /**
     * Este método calcula el descuento por comprar algún artículo, 1 o +
     * 
     * @param precioProducto 
     * @see #aplicarDescuento(double, int) 
     * 
     */
    public void descuentoPorCompra(double precioProducto) {
        double totalDescuentoAplicado;
        totalDescuentoAplicado = precioProducto * DCTO;
        System.out.println("El total a pagar es:" + totalDescuentoAplicado);
        System.out.println("Enviado");
    }
    /**
     * Este método calcula el descuento cuando no se relaiza ninguna compra
     * 
     * @param precioProducto 
     * @see #aplicarDescuento(double, int) 
     */
    public void noDescuento(double precioProducto) {
        double totalDescuentoAplicado;
        totalDescuentoAplicado = precioProducto * NODCTO;
        System.out.println("El total a pagar es:" + totalDescuentoAplicado);
        System.out.println("Enviado");
    }
    /**
     * Este método es el que aplica cada descuento según el número de artículos
     * 
     * @param precioProducto
     * @param numProductos 
     * @see #descuentoPorArticulos(double precioProducto)
     * @see #descuentoPorCompra(double precioProducto)
     * @see #noDescuento(double precioProducto)
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto = descuentoPorArticulos(precioProducto);
        }
        if (numProductos != 0) {
            descuentoPorCompra(precioProducto);
        } else {
            noDescuento(precioProducto);
        }
    }
}
