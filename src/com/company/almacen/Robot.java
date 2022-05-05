package com.company.almacen;

import com.company.GenericStack;
import com.company.util.RobotUtils;

public class Robot {
    String nombre;
    GenericStack espacioCarga;
    public Robot(){
        nombre= RobotUtils.generarNombreRobot();
        espacioCarga=new GenericStack();
    }
}
