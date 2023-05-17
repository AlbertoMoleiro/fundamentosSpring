package interfaces.ejemplo2.model;

public class Conductor {

    IVehiculo vehiculo;

    public Conductor(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }

    public String Conducir(){
        return vehiculo.moverse();
    }
}
