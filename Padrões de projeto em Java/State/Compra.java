import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Compra {
    public enum Clima {EmbalarObjeto, RealizarEntrega, SeparaEstoque, Transportadora;};
    Clima clima;
    EstadoCompra estado;
    Boolean compraPaga = true;
    public Compra(){    
        if(compraPaga){
            System.out.println("Compra confirmada.");
            estado = new SeparaEstoque();
        }        
    }
    public void mudaEstado(){
        Random random = new Random();
        int indice = random.nextInt(2);
        this.clima = clima.values()[indice];
        if (clima.toString() == "EmbalarObjeto"){
            estado = new EmbalarObjeto();
        }
    }
    
    /*public void embalaobjeto(){
        estado = new EmbalarObjeto();
    } 
    public void enviaTransportadora() {
        estado = new Transportadora();
    } 
    public void realizaEntrega() {
        estado = new RealizarEntrega();
    }    */
}
