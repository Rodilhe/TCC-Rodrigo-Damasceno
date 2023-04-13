package Factory.Servicos;
import javax.swing.JOptionPane;
public class Rifood implements Servico{

    @Override
    public void iniciaRota() {
        getCarga(); 
        JOptionPane.showMessageDialog(null,"Inicia Entrega");
    }
    @Override
    public void getCarga() {
        JOptionPane.showMessageDialog(null,"Encomenda retirada e esta pronto");
    }
    
}
