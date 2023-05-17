package com.softtek.fundamentosSpring1.accesos;

import org.springframework.stereotype.Component;

@Component("accesoProduccion")
public class AccesoProduccion implements IDAO{
    public AccesoProduccion() {
    }
    public String insertar(Cliente cliente) {
        return "Insertando cliente en producción";
    }
}
