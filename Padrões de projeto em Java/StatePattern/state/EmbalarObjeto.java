package state;

public class EmbalarObjeto implements EstadoCompra{
    String status = "Objeto embalado.";
    @Override
    public String getStatus() {        
        return status;
    }
}
