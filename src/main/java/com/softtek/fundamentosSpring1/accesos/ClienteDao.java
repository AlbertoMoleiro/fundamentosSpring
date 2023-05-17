package interfaces.ejemplo4.model;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {
        return conexion.insertar(cliente);
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
