package com.softtek.fundamentosSpring1.accesos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClienteDao {
    @Autowired
    @Qualifier("accesoProduccion")
    private IDAO conexion;

    public ClienteDao() {
    }
    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {
        return conexion.insertar(cliente);
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
