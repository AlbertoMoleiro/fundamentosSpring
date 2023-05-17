package com.softtek.fundamentosSpring1.modelSeguros;

import org.springframework.stereotype.Component;

@Component("tallerMecanica")
public class TallerMecanica implements ITaller {

    public String reparar(Coche c) {
        return "Reparando coche";
    }

}
