package com.softtek.fundamentosSpring1.conductor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conductor {
@Autowired
    IVehiculo vehiculo;

    public Conductor(){}
    public Conductor(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return vehiculo.moverse();
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
