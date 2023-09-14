package state;

public class RealizarEntrega implements EstadoCompra{
    String status = "Objeto saiu para entrega.";
    @Override
    public String getStatus() {        
        return status;
    }
}
