package Factory;
import Factory.Servicos.Rifood;
import Factory.Servicos.Servico;
public class PedidoRifood extends Pedido {    
    @Override
    protected Servico criaPedido() {
        return new Rifood();
    }
    
}
