package com.softtek.fundamentosSpring1.model;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements ITaller {

    public String reparar(Coche c) {
        return "Reparando coche";
    }

}
