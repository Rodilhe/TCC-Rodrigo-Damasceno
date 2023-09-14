package factory;
import factory.Servicos.Servico;
import factory.Servicos.Ruber;
public class PedidoRuber extends Pedido{
    @Override
    protected Servico criaPedido() {
        return new Ruber();
    }
    
}
