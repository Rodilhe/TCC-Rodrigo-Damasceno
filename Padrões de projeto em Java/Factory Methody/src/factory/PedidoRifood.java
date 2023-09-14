package factory;
import factory.Servicos.Rifood;
import factory.Servicos.Servico;
public class PedidoRifood extends Pedido {    
    @Override
    protected Servico criaPedido() {
        return new Rifood();
    }
    
}
