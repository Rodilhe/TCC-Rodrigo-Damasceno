public class SeparaEstoque implements EstadoCompra {
    String status = "Objeto separado.";
    @Override
    public String getStatus() {
        return status;
    }
}
