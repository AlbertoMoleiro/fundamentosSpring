package com.softtek.fundamentosSpring1.modelSeguros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {



    @Autowired
    @Qualifier("tallerPintura")
    private ITaller taller;

    private String aseguradora;

    public SeguroCoche(){}
    public SeguroCoche(@Qualifier("tallerPintura") ITaller taller,String aseguradora){
        this.aseguradora = aseguradora;
        this.taller = taller;
    }

    public String reparar(Coche c){
        return taller.reparar(c);
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
