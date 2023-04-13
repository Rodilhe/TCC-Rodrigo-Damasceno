public class Loja{
    protected RecebePedido recebe_pedido;
    protected ConfirmaPagamento confirma_pedido;
    protected SeparaPedido separa_pedido;
    protected EnviaPedido envia_pedido;

    public void Pedido (){
        recebe_pedido = new RecebePedido();
        recebe_pedido.recebePedido();
        confirma_pedido = new ConfirmaPagamento();
        confirma_pedido.confirmaPagamento();
        separa_pedido = new SeparaPedido();
        separa_pedido.separaPedido();
        envia_pedido = new EnviaPedido();
        envia_pedido.enviaPedido();
    }    
    public static void main(String[] args) {
        System.out.println("");
        Loja loja = new Loja();
        loja.Pedido();
    }
}