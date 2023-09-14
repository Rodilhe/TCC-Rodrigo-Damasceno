package factory;
import factory.Servicos.Servico;

public abstract class Pedido {    
    void iniciaTransporte(){
        Servico pedido = criaPedido();
        pedido.iniciaRota();
    }
    protected abstract Servico criaPedido();

}
