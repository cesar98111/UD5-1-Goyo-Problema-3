package com.company;

import com.company.almacen.Almacen;

public class Main {

    public static void main(String[] args) {
        Almacen Amazon= new Almacen("Amazon");
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();
        Amazon.enviarRobot();

        Amazon.recibeRobot();
    }
}
