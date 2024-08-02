package main;

import productos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();
        
        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("=============================");
        System.out.println("Producto más caro: " + Collections.max(productos).getNombre());
        System.out.println("Producto más barato: " + Collections.min(productos).getNombre());
    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new Bebida("Coca-Cola", 1.5, 18));
        productos.add(new ArticuloBaño("Shampoo Sedal", 500, 19));
        productos.add(new Fruta("Frutillas", 64, "kilo"));
        return productos;
    }
}

