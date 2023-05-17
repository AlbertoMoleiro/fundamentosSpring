package com.softtek.fundamentosSpring1.conductor;

import org.springframework.stereotype.Component;

@Component
public class CocheConductor implements IVehiculo{

    private int deposito;
    public CocheConductor(){

    }
    public CocheConductor(int deposito){
        this.deposito = deposito;
    }
    @Override
    public String moverse(){
        if(deposito > 0){

            return "Me muevo";
        }else {
            return "No me muevo";
        }
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
