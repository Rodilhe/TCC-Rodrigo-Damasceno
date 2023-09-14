package state;

public class Transportadora implements EstadoCompra{
    String status = "Objeto enviado a transportadora.";
    @Override
    public String getStatus() {        
        return status;
    }
}
