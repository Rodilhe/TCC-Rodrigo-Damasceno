package Factory;
import Factory.Servicos.Servico;
import Factory.Servicos.Ruber;
public class PedidoRuber extends Pedido{
    @Override
    protected Servico criaPedido() {
        return new Ruber();
    }
    
}
