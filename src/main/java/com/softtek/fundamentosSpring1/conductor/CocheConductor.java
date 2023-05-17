package interfaces.ejemplo2.model;

public class Coche implements IVehiculo{
    private int deposito;

    public Coche(int deposito){
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
}
