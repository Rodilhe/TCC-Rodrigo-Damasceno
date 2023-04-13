package Observer;
import java.util.ArrayList;
import java.util.List;

public class FilialSP implements Observer{
    private List<String> cardapio = new ArrayList();
    private Subject filial;

    public FilialSP(Subject filial){
        this.filial = filial;
        this.filial.addObserver(this);
    }
    public void exibirCardapio(){
        System.out.println("Cardapio Filial SP:");
        for( String exibecardapio :cardapio){
            System.out.println(exibecardapio);
        }
        System.out.println("\n");
    }

    @Override
    public void update(List<String> cardapio) {
        this.cardapio = cardapio;
        
    }}
