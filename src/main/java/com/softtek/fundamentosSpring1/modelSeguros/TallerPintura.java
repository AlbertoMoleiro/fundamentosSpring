package com.softtek.fundamentosSpring1.modelSeguros;

import org.springframework.stereotype.Component;

@Component("tallerPintura")
public class TallerPintura implements ITaller{

    public String reparar(Coche c) {
        return "Pintando coche";
    }
}
