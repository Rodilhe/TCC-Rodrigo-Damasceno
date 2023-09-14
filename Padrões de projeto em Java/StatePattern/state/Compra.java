package state;

import java.util.Random;

public class Compra {
    public enum Clima {EmbalarObjeto, RealizarEntrega, SeparaEstoque, Transportadora;};
    Clima clima;
    EstadoCompra estado;
    Boolean compraPaga = true;
    public Compra(){    
        if(compraPaga){
            System.out.println("state.Compra confirmada.");
            estado = new SeparaEstoque();
        }        
    }
    public void mudaEstado(){
        Random random = new Random();
        int indice = random.nextInt(2);
        this.clima = clima.values()[indice];
        if (clima.toString() == "state.EmbalarObjeto"){
            estado = new EmbalarObjeto();
        }
    }
    
    /*public void embalaobjeto(){
        estado = new state.EmbalarObjeto();
    } 
    public void enviaTransportadora() {
        estado = new state.Transportadora();
    } 
    public void realizaEntrega() {
        estado = new state.RealizarEntrega();
    }    */
}
