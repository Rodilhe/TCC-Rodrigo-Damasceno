public class RecebePedido {
    public boolean pedido_ok(){
        return true;
    }
    public void recebePedido(){
        System.out.println("Recebendo Pedido.. \n");
        if(this.pedido_ok()==true){
            System.out.println("Pedido confirmado!\n");
        }
    }
    
}
