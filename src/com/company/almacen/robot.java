package com.company.almacen;

import com.company.GenericStack;
import com.company.util.RobotUtils;

public class robot {
    String nombre;
    GenericStack espacioCarga;
    public robot(){
        nombre= RobotUtils.generarNombreRobot();
        espacioCarga=new GenericStack();
    }
}
