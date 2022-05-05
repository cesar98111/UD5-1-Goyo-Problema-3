package com.company.almacen;

import com.company.dataestructure.GenericQueue;

public class Almacen {
    int enviados;
    String nombre;
    GenericQueue colaRobots;
    public Almacen(String nombre){
        colaRobots = new GenericQueue<Robot>();
        this.nombre = nombre;
    }
    public void enviarRobot(){
        colaRobots.enQueue(new Robot());
        enviados++;
    }
    public void recibeRobot(){
        for (int i = 0; i < enviados; i++) {
            Robot robotRecogido = colaRobots.deQueue();
            System.out.println(robotRecogido);
            robotRecogido.Descarga();
        }

    }

}
