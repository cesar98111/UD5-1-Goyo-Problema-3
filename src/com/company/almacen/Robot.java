package com.company.almacen;

import com.company.dataestructure.GenericStack;
import com.company.util.RobotUtils;

public class Robot {
    private final int ESPACIO= 10;
    String nombre;
    GenericStack espacioCarga;
    public Robot(){
        nombre= RobotUtils.generarNombreRobot();
        espacioCarga=new GenericStack<Producto>();
    }
    public void Carga(){
        for (int i = 0; i < ESPACIO; i++) {
            espacioCarga.push(new Producto());
        }
    }
    public void Descarga(){
        for (int i = 0; i < ESPACIO; i++) {
            System.out.println(espacioCarga.pop());
        }
    }

    @Override
    public String toString() {
        return nombre +"con \n";
    }
}
