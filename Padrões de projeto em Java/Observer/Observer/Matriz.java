package Observer;
import java.util.ArrayList;
import java.util.List;
public class Matriz implements Subject{
    private List<String> cardapio = new ArrayList();
    private List<Observer> filiais;
    public Matriz(){
        filiais = new ArrayList<>();
    }
    public void adicionaItemCardapio(String item){
        cardapio.add(item);
        notifyObservers();
        System.out.println("Item adicionado ao cardápio. Atualizado!\n");
    }
    public void removeItemCardapio(String item){
        cardapio.remove(item);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        filiais.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        for( Observer filial :filiais ){
            if(filial==observer){
                filiais.remove(filial);
                break;
            };
        }
    }        
    @Override
    public void notifyObservers() {        
        for( Observer filial :filiais ){
            filial.update(cardapio);
        }        
    }    
}
