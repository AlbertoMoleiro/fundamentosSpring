package com.softtek.fundamentosSpring1.modelSeguros;

public class Coche {
    private String matricula;
    private int modelo;

    public Coche(String matricula, int modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    //Getters Setters
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public int getModelo(){
        return modelo;
    }
    public void setModelo(int modelo){
        this.modelo = modelo;
    }
}
