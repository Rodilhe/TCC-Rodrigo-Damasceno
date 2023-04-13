package Factory;
import javax.swing.JOptionPane;

public class Cliente {
    private static Pedido pedido;
    public static void main(String[] args) throws Exception {
        int type = Integer.parseInt (JOptionPane.showInputDialog("Selecione novamente, 1-Ruber ou 2-Rifood:"));
        switch(type){
            case 1:
                setPedido(new PedidoRuber());
                pedido.iniciaTransporte();             
                break;
            case 2:
                setPedido(new PedidoRifood());
                pedido.iniciaTransporte();   
                break;
            default :
            JOptionPane.showMessageDialog(null,"Selecione novamente, 1-Ruber ou 2-Rifood:");
        }
    }
    public static Pedido getPedido() {
        return pedido;
    }
    public static void setPedido(Pedido pedido) {
        Cliente.pedido = pedido;
    }
}
