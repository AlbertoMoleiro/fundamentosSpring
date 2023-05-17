package com.softtek.fundamentosSpring1.model;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller{

    public String reparar(Coche c) {
        return "Pintando coche";
    }
}
