import java.util.Random;
public class MudaEstado {
    public enum Estado {Sol, Chuvoso, Nublado;};
    Clima clima;
    Estado estado;
    public MudaEstado(){
    }
    public Clima mudaEstado(){
        Random random = new Random();
        int indice = random.nextInt(2);
        this.estado = estado.values()[indice];
        if (estado.toString() == "Sol"){
            clima = new Sol();
            return clima;
        }
        else if (estado.toString() == "Chuvoso"){
            clima = new Chuvoso();
            return clima;
        }
        else if (estado.toString() == "Nublado"){
            clima = new Nublado();
            return clima;
        }
        return clima;
    }    
}
