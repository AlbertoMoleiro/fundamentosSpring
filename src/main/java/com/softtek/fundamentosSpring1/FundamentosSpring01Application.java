package com.softtek.fundamentosSpring1;

import com.softtek.fundamentosSpring1.conductor.CocheConductor;
import com.softtek.fundamentosSpring1.conductor.Conductor;
import com.softtek.fundamentosSpring1.modelSeguros.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  com.softtek.fundamentosSpring1.modelSeguros.Coche;

@SpringBootApplication
public class Funadmentos01Application implements CommandLineRunner {
    @Autowired
    private SeguroCoche s1;
    @Autowired
    private Conductor Juan;

    public static void main(String[] args) {
        SpringApplication.run(Funadmentos01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Coche coche = new Coche("1234ABC", 2010);
        System.out.println(s1.reparar(coche));


        ((CocheConductor) Juan.getVehiculo()).setDeposito(20);
        System.out.println(Juan.Conducir());



    }
}
