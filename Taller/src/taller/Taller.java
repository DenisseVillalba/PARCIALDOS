
package taller;

import java.util.Scanner;


public class Taller {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" Menu ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();

                    try {
                        Producto producto = new Producto(nombre, cantidad, precio);
                        inventario.agregarProducto(producto);
                        System.out.println("Producto agregado con exito.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.println("Lista de Productos");
                    inventario.mostrarProductos();
                }

                case 3 -> {
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombre = scanner.nextLine();
                    Producto producto = inventario.buscarProducto(nombre);
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                }

                case 4 -> {
                    double total = inventario.calcularValorTotal();
                    System.out.println("Valor total del inventario: $" + total);
                }

                case 5 -> {
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombre = scanner.nextLine();
                    inventario.eliminarProducto(nombre);
                }

                case 6 -> {
                    System.out.println("Saliendo del programa.");
                    return;
                }

                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}