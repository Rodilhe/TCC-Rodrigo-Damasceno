package Observer;
import java.util.List;

public interface Observer {
    public void update(List<String> cardapio);
}
public interface SubjectFilial{
    public void addObserver( Observer observer );
    public void removeObserver( Observer observer );
    public void notifyObservers();


    
}
