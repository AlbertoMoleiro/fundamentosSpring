package com.softtek.fundamentosSpring1.accesos;

import org.springframework.stereotype.Component;

@Component("accesoDesarrollo")
public class AccesoDesarrollo implements IDAO{
    public AccesoDesarrollo() {
    }
    public String insertar(Cliente cliente) {
        return "Insertando cliente en desarrollo";
    }
}
