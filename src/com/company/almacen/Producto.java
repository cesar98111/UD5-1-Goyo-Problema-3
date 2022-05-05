package com.company.almacen;


import com.company.util.RobotUtils;

public class Producto {
    String nombre;
    float precio;
    public Producto(){
        nombre= RobotUtils.generarNombreProducto();
        precio=RobotUtils.generarPrecio();
    }

    @Override
    public String toString() {
        return nombre+"con precio de :"+ precio;
    }
}
