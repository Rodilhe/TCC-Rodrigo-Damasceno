package Observer;
import java.util.ArrayList;
import java.util.List;

public class FilialRio implements Observer{
    private List<String> cardapio = new ArrayList();
    private Subject filial;

    public FilialRio(Subject filial){
        this.filial = filial;
        this.filial.addObserver(this);
    }
    public void exibirCardapio(){
        System.out.println("Cardapio Filial Rio:");
        for( String exibecardapio :cardapio){
            System.out.println(exibecardapio);
        }
        System.out.println("\n");
    }

    @Override
    public void update(List<String> cardapio) {
        this.cardapio = cardapio;
        
    }}
