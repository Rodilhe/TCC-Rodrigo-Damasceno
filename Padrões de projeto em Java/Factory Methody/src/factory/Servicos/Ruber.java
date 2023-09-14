package factory.Servicos;
import javax.swing.JOptionPane;
public class Ruber implements Servico{
    @Override
    public void iniciaRota(){
        getCarga();
        JOptionPane.showMessageDialog(null,"Inicia trajeto");
    }
    @Override
    public void getCarga(){
        JOptionPane.showMessageDialog(null,"Pegou os passageiros e esta pronto");
    }

}
